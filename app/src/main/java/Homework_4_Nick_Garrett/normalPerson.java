package Homework_4_Nick_Garrett;

public class normalPerson implements person{

    //age name, birthday
    private String name;
    private int age;
    private String birthday;

    //initializers
    public normalPerson(String name, int age, String birthday)
    {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        System.out.println("New Person Added;\n\t\tname:"+name+"\n\t\tage:"+age+"\n\t\tbirthday:"+birthday+"\n");
    }

    public normalPerson() {    }




    /////////////////////////////////
    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    /////////////////////////////////
    //age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    /////////////////////////////////
    //birthday
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }



    /////////////////////////////////
    //info
    public String getInfo() {
        return name+" "+age+" "+birthday;
    }



    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
