package Structural.Proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheBackedQueryProxy implements ICacheBackedProxy {
    Map<String, String> queryCache;
    DBQueryExecutor queryExecutor;

    public CacheBackedQueryProxy(DBQueryExecutor queryExecutor) {
        this.queryCache = new HashMap<>();
        this.queryExecutor = queryExecutor;
    }

    /**
     * The proxy add extra functionality besides the play() logic.
     * */
    public String query(String query){
        String result = beforeQuery(query);
        if (result != null)
        {
            return result;
        }

        result = queryExecutor.query(query);
        afterQuery(query, result);
        return result;
    }

    public String beforeQuery(String query){
        if (queryCache.containsKey(query)){
            System.out.println("Cache hit.");
            return queryCache.get(query);
        }
        System.out.println("Cache miss.");
        return null;
    }

    public void afterQuery(String query, String result){
        System.out.println("Cached result.");
        this.queryCache.put(query, result);
    }
}
