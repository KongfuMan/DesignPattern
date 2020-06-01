package Behavioral.Visitor;

public class ConcreteGrader implements Grader {
    @Override
    public void act(Teacher teacher, Student student) {
        if (teacher.getPaperCnt() > 10 && student.getScore() > 90){
            System.out.println("评级为优秀");
        }
    }
}
