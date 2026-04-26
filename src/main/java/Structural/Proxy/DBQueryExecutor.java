package Structural.Proxy;

public class DBQueryExecutor{

    public String query(String query){
        System.out.println("query DB.");
        return "query result from DB.";
    }
}
