package Structural.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters;


    public FilterChain() {
        filters = new ArrayList<>();
    }

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public boolean validate(){
        for (Filter f : filters){
            f.validate();
        }
        return true;
    }
}
