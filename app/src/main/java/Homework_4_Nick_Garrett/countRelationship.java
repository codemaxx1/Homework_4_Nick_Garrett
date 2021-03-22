package Homework_4_Nick_Garrett;

public class countRelationship implements Visitor{

    @Override
    public void visit(normalPerson relationship) {

    }

    //call each time a relationship is made
    public void visit(Homework_4_Nick_Garrett.normalPerson person1, Homework_4_Nick_Garrett.normalPerson person2) {
        String[] relation = relationshipInterface.getRelationship(person1,person2);
        System.out.print("relationship between:"+person1+" and "+person2+" is: ");

        //print the relationships
        for(String i : relation)
            System.out.println(i);

    }


}
