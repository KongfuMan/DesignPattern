package Structural.Proxy;

public class Client {
    public static void main(String[] args) {
        Movie movie = new RealMovieProxy(new RealMovie());
        movie.play();
    }
}
