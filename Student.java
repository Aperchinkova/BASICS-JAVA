package Student20;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public String city;
    public Student(String firstName,String lastName,int age,String city)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.city=city;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}
