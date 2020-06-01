package Behavioral.Visitor;

public abstract class Faculty {
    private Grader grader;

    public void acceptVisitor(Grader grader){
        this.grader = grader;
    }
}
