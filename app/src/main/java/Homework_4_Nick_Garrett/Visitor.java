package Homework_4_Nick_Garrett;

public interface Visitor {

    //there is only one type of person, so we only need to visit it.
    public void visit(normalPerson person);
}
