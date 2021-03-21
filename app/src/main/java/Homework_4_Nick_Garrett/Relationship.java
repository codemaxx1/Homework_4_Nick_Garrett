package Homework_4_Nick_Garrett;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

public class Relationship {
    //variable definitions
    String relationship[];


    //initiator
    public Relationship() {
    }


    //cousin, aunt, uncle, father, mother, brother, sister, niece, nephew
    public MutableNetwork<Object, String> family = NetworkBuilder.directed().allowsParallelEdges(true).build();



    //add a new relationship between two people
    public void setRelationship(Object name1, Object name2, String relationship)
    {

        //make typecast instances
        normalPerson NAME1 = (normalPerson) name1;
        normalPerson NAME2 = (normalPerson) name2;

        //add a new edge
        family.addEdge(name1, name2, relationship);

        //print to the user
        System.out.println("Relation added.\n\tPerson 1:"+NAME1.getName()+"\n\tPerson 2:"+NAME2.getName()+"\n\tRelation:"+relationship+"\n");

    }





    //getter function returns a set of strings
    public String[] getRelationship(Object name1, Object name2){
        //variable declarations

        //make typecast instances
        normalPerson NAME1 = (normalPerson) name1;
        normalPerson NAME2 = (normalPerson) name2;

        //get the name of the relationship from name1 to name2
        if(family.hasEdgeConnecting(NAME1, NAME2))
        relationship = family.edgesConnecting(NAME1, NAME2).toArray(new String[0]);

        //if there is no edge connection name1 and name 2, then return null
        else
            relationship = new String[]{null};

        //print out the relationships between name1 and name2
        System.out.print("Relationship between "+NAME1.getName()+" and "+NAME2.getName()+" is ");
        if(!(relationship == null))
        {
            for (String rel : relationship){
                System.out.print(rel);
            }
        }
        //if there are no relationships, then list "null"
        else
        {
            System.out.print("none");
        }

        System.out.println("");

        return relationship;
    }

}
