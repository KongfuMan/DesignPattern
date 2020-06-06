package Behavioral.Visitor;

import javax.lang.model.element.Element;
import java.nio.file.FileVisitor;

public class Student extends Faculty {
    private int score;

    public int getScore() {
        FileVisitor fileVisitor;
        Element element;
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
