package OrderByAge;

public class Person {
    private String firstname;
    private String id;
    private int age;
    public Person(String firstname,String id,int age)
    {
        this.firstname=firstname;
        this.id=id;
        this.age=age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setId(String id){
        this.id=id;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getId()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
}
