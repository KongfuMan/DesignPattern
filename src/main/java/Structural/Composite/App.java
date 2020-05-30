package Structural.Composite;

public class App {
    public static void main(String[] args) {
        SubComponent fullName = new Sentence();
        SubComponent firstName = new Word();
        firstName.add(new Letter('L'));
        firstName.add(new Letter('i'));
        firstName.add(new Letter('a'));
        firstName.add(new Letter('n'));
        firstName.add(new Letter('g'));
        fullName.add(firstName);

        SubComponent lastName = new Word();
        lastName.add(new Letter('C'));
        lastName.add(new Letter('h'));
        lastName.add(new Letter('e'));
        lastName.add(new Letter('n'));
        fullName.add(lastName);
        System.out.println(firstName.print());
        System.out.println(lastName.print());
        System.out.println(fullName.print());
    }
}
