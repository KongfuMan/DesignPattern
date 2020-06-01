package Behavioral.Mediator;

public class App {
    public static void main(String[] args) {
        IMediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleagueA(mediator);
        Colleague colleague2 = new ConcreteColleagueB(mediator);
        Colleague colleague3 = new ConcreteColleagueC(mediator);

        colleague1.sendMessage("This msg is from colleague 1");
    }
}
