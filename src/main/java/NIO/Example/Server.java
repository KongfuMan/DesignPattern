package NIO.Example;

public class Server {
    private NIOEndpoint endpoint;

    public static void main(String[] args) throws Exception {
        Server server = new Server();
        server.endpoint = new NIOEndpoint();
        server.endpoint.startAcceptorThread();
        server.endpoint.startPollerThread();
    }

}
