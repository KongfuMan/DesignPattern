package Behavioral.Proxy;

public class RealMovieProxy implements Movie {
    RealMovie realMovie;

    public RealMovieProxy(RealMovie realMovie) {
        this.realMovie = realMovie;
    }

    public void play(){
        beforePlay();
        realMovie.play();
        afterPlay();
    }

    public void beforePlay(){
        System.out.println("our popcorn, buy one and get one for free");
    }

    public void afterPlay(){
        System.out.println("our popcorn, buy one and get two for free");
    }
}
