package Lessons11To13;
//what does "static" keyword do?
//static members belong to the class instead of a specific instance.
public class Lesson12
{
    public static void main(String[] args){
        //first example of static keyword
        Hello hello = new Hello();
        hello.age = 10;
        System.out.println(hello.age);
        //Hello.DoSomething("Hi youtube");
        //hello.DoSomethingElse("hello world");
        Hello hello1 = new Hello();
        hello1.age = 50;
        System.out.println(hello1.age);
        System.out.println("*****************");

        //second example of static keyword
        Student mark = new Student();
        Student tom = new Student();
        System.out.println(Student.getNoOfStudents());

    }
}