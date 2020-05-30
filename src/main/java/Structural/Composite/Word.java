package Structural.Composite;

public class Word extends SubComponent {
    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        for (Component child : this.children){
            sb.append(child.print());
        }
        return sb.toString();
    }
}
