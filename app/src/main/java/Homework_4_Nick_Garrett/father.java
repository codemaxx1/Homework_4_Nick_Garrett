package Homework_4_Nick_Garrett;

public class father extends relationshipInterface{
    String relationship = "father";

    //add a new relationship between two people
    void createRelationship(Object name1, Object name2)
    {

        //make typecast instances
        NAME1 = (normalPerson) name1;
        NAME2 = (normalPerson) name2;

        relationshipStringHasher relationshipHashed = new relationshipStringHasher(relationship);

        //add a new edge
        family.addEdge(name1, name2, relationshipHashed.toString());


        //print to the user
        System.out.println("Relation added.\n\tPerson 1:"+NAME1.getName()+"\n\tPerson 2:"+NAME2.getName()+"\n\tRelation:"+relationship+"\n");

    }

    private String toString(String relationship) {
        this.relationship = relationship;

        return(relationship);
    }

    public String[] accept(normalPerson person1, normalPerson person2) {
        //Visitor.getRelationship();
        return getRelationship(person1, person2);
    }
}
