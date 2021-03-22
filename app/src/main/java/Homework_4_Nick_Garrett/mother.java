package Homework_4_Nick_Garrett;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

public class mother extends relationshipInterface{
    //public MutableNetwork<Object, String> family = NetworkBuilder.directed().allowsParallelEdges(true).build();

    String relationship = "mother";

    //add a new relationship between two people
    void createRelationship(Object name1, Object name2)
    {

        //make typecast instances
        NAME1 = (normalPerson) name1;
        NAME2 = (normalPerson) name2;

        //add a new edge
        family.addEdge(name1, name2, relationship);


        //print to the user
        System.out.println("Relation added.\n\tPerson 1:"+NAME1.getName()+"\n\tPerson 2:"+NAME2.getName()+"\n\tRelation:"+relationship+"\n");

    }

    

}
