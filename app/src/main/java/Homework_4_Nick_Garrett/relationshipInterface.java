package Homework_4_Nick_Garrett;

import com.google.common.graph.AbstractNetwork;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

abstract public class relationshipInterface {
    //variable declarations
    String relationship;
    normalPerson NAME1;
    normalPerson NAME2;

    public static MutableNetwork<Object, String> family = NetworkBuilder.undirected().allowsParallelEdges(true).build();



    abstract void createRelationship(Object name1, Object name2);

    public static String[] getRelationship(Object name1, Object name2) {
        //MutableNetwork<Object, String> family = NetworkBuilder.directed().allowsParallelEdges(true).build();

        //variable declarations
        String[] relationship;

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
            for (String rel : relationship)
                System.out.print(rel);

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
