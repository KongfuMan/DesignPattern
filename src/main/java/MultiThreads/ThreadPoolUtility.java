package MultiThreads;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.*;

public class ThreadPoolUtility {
    private ThreadPoolExecutor executor;
    private HttpClient client;

    public ThreadPoolUtility() throws URISyntaxException {
        //Requirements:
        //- run at most 4～8 个 Worker Threads in parallel. [corePoolSize, maximumPoolSize]
        //- allow at most 100 Job in backlog.
        //- Each Job needs to invoke external API，which takes 2 seconds.
        //- 当线程池和队列都满了，需要有 Backpressure。
        //- 程序退出时优雅关闭线程池。
        this.executor = new ThreadPoolExecutor(
                4,                          // corePoolSize
                8,                          // maximumPoolSize
                60, TimeUnit.SECONDS,       // keepAliveTime
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(), // the factory to use when the executor creates a new thread
                new ThreadPoolExecutor.CallerRunsPolicy() // the handler to use when execution is blocked because the thread bounds and queue capacities are reached
        );
        this.client = HttpClient.newBuilder().build();

        var ver = this.client.version();

        URI uri = URI.create("https://www.google.com");
        var schema = uri.getScheme();
        try {
            var request = HttpRequest.newBuilder().GET().uri(uri).build();
            CompletableFuture<HttpResponse<String>> future =
                    this.client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Is http response done: " + future.isDone());
            Thread.sleep(1000);
            System.out.println("Is http response done after 1 sec: " + future.isDone());
            System.out.println("response content: " +future.get().statusCode());
        }catch (Exception e){
        }
    }

    public void run(){
        try {
            for (int i = 1; i <= 20; i++) {
                final int jobId = i;

                executor.execute(() -> {
                    processJob(jobId);
                });

                System.out.printf(
                        "Job %d submitted, active=%d, queued=%d%n",
                        jobId,
                        executor.getActiveCount(),
                        executor.getQueue().size()
                );
            }
        } finally {
            executor.shutdown();

            try {
                if (!executor.awaitTermination(
                        5, TimeUnit.MINUTES)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                executor.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    private static void processJob(int jobId) {
        String threadName =
                Thread.currentThread().getName();

        System.out.printf(
                "START Job %d on %s%n",
                jobId, threadName
        );

        try {
            // Simulate a blocking external API call
            Thread.sleep(2000);

            System.out.printf(
                    "DONE Job %d on %s%n",
                    jobId, threadName
            );

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
