package Structural.Composite;

public class Letter implements Component {
    private char ch;

    public Letter(char ch) {
        this.ch = ch;
    }

    @Override
    public String print() {
        return String.valueOf(ch);
    }
}
