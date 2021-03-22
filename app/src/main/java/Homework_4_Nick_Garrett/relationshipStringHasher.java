package Homework_4_Nick_Garrett;

public class relationshipStringHasher {

        private final String relation;

        relationshipStringHasher(String relation)
        {
            this.relation = relation;
        }

        @Override
        public String toString()
        {
            //returns the hashed string
            return relation;
        }


}
