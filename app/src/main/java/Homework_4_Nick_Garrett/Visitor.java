package Homework_4_Nick_Garrett;

public interface Visitor {

    static void getRelationship(normalPerson person1, normalPerson person2) {
    }



    //there is only one type of person, so we only need to visit it.
    public void visit(normalPerson relationship);

}
