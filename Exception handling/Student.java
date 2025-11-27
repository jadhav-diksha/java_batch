public class Student
{
    String name;
    int age;
    float grade;

    Student()
    {
        name="diksha";
        age=22;
        grade=99;
    }

    Student(String name,int age,float grade)
    {
     this.name=name;
        this.age=age;
        this.grade=grade;   
    }
    void display()
    {
        System.out.println("name"+name+ "age"+age+ "grade" +grade);
    }

    public static void main(String args[])
    {
        Student s=new Student();
        s.display();

         Student s1=new Student("diksha",22,87);
        s1.display();
        

    }
}