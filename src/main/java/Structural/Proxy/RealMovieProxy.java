package Structural.Proxy;

public class RealMovieProxy implements Movie {
    RealMovie realMovie;

    public RealMovieProxy(RealMovie realMovie) {
        this.realMovie = realMovie;
    }

    /**
     * The proxy add extra functionality besides the play() logic.
     *
     * */
    public void play(){
        beforePlay();       //extra logic
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
