package Homework_4_Nick_Garrett;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

import java.util.Set;

public class Relationship {
    //String relationship;


    //cousin, aunt, uncle, father, mother, brother, sister, niece, nephew
    public MutableNetwork<Object, String> family = NetworkBuilder.directed().allowsParallelEdges(true).build();


    //add a new relationship between two people
    public Relationship(Object name1, Object name2, String relationship)
    {

        //make typecast instances
        normalPerson NAME1 = (normalPerson) name1;
        normalPerson NAME2 = (normalPerson) name2;

        //add a new edge
        family.addEdge(name1, name2, relationship);

        //print to the user
        System.out.println("Relation added.\n\tPerson 1:"+NAME1.getName()+"\n\tPerson 2:"+NAME2.getName()+"\n\tRelation:"+relationship+"\n");

    }

    public Relationship() {
    }

    public Set<String> getRelationship(Object name1, Object name2){
        Set<String> relationship;
        //make typecast instances
        normalPerson NAME1 = (normalPerson) name1;
        normalPerson NAME2 = (normalPerson) name2;

        //get the name of the relationship from name1 to name2
        if(family.hasEdgeConnecting(NAME1, NAME2))
        relationship = family.edgesConnecting(NAME1,NAME2);
        else
        {
            //relationship
        }

        System.out.print("Relationship between "+NAME1.getName()+" and "+NAME2.getName()+" is ");
        if(!relationship.isEmpty())
        {
            for (String rel : relationship){
                System.out.print(rel);
            }
        }
        else
        {
            System.out.print("none");
        }

        System.out.println("");

        return relationship;
    }

}
