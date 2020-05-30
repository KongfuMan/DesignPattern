package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class SubComponent implements Component {
    List<Component> children;

    public SubComponent(){
        children = new ArrayList<>();
    }

    public void add(Component component){
        children.add(component);
    }
}
