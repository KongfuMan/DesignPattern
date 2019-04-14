package IPC;

import java.util.HashMap;
import java.util.Map;

public class ServiceManager {
    Map<String, Class> DNS = new HashMap<>();


    public void register(Class c){
        String className = c.getName();
        this.DNS.put(className,c);
    }
}
