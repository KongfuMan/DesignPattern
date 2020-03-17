package IPC;

public class Server {
    private IBinder binder;
    public Server(){
        binder = new Binder();
    }
    public int sumService(int a, int b){
        return a + b;
    }
}
