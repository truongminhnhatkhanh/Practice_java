class Person
{
    String name,address,id;
    int age;
    public Person(String id, String name, String address, int age)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public void details()
    {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("address = " + address);
        System.out.println("age = " + age);
    }
}
class Teacher extends Person
{
    String institution_name,course;
    public Teacher(String id, String name, String address, int age, String instituiton_name , String course)
    {
        super(id, name, address, age);
        this.institution_name=instituiton_name;
        this.course=course;
    }
    public void details()
    {
        super.details();
        System.out.println("institution = " + institution_name);
        System.out.println("course = " + course);
    }
}
public class ex7{
    public static void main(String[]args){
        Person A = new Person("suhdn","dsjfj","dvv",18);
        A.details();
        System.out.println("-----------------");
        Teacher B = new Teacher("kdjs","dvjshh","fvvv",25,"Viet Korea University","Java");
        B.details();
    }
}
