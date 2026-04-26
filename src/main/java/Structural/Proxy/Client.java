package Structural.Proxy;

public class Client {
    public static void main(String[] args) {
        ICacheBackedProxy queryProxy = new CacheBackedQueryProxy(new DBQueryExecutor());
        String result = queryProxy.query("My Query 1");
        System.out.println();
        result = queryProxy.query("My Query 1");
        System.out.println();
        result = queryProxy.query("My Query 1");
    }
}
