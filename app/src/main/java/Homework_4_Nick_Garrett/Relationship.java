package Homework_4_Nick_Garrett;

import com.google.common.graph.Graph;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

import java.io.Serializable;
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

}
