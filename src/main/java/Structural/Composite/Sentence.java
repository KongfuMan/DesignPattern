package Structural.Composite;

public class Sentence extends SubComponent {
    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        for (Component child : this.children) {
            sb.append(child.print());
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public void add(Word component){
        children.add(component);
    }
}
