package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements IMediator {
    private List<Colleague> colleagueList;

    public ConcreteMediator() {
        this.colleagueList = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagueList.add(colleague);
    }
}
