package Homework_4_Nick_Garrett;

public class countRelationship implements Visitor{

    @Override
    public void visit(normalPerson relationship) {

    }


    //call each time a relationship is made
    public void visit(Homework_4_Nick_Garrett.normalPerson person1, Homework_4_Nick_Garrett.normalPerson person2) {
        String[] relation = relationshipInterface.getRelationship(person1,person2);
        //array to hold numbers for
        /*              brother
                        | sister
                        | | mother
                        | |  | father
                        | |  | |
         */
        int[] numbers = {0,0,0,0};
        for(String i : relation)
        {
            if(i.equals("brother"))numbers[0]++;
            if(i.equals("sister"))numbers[1]++;
            if(i.equals("mother"))numbers[2]++;
            if(i.equals("father"))numbers[3]++;
        }


        System.out.println("relationship type:\nbrother, sister, mother, father\n\t"+numbers[0]+"\t"+numbers[1]+"\t"+numbers[2]+"\t"+numbers[3]);
    }


}
