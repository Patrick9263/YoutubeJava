package LessonsOneToTen;
//encapsulation
public class Lesson9
{
    public static void main(String[] args)
    {
        Student mark = new Student(); //Mark -> object or instance
        mark.setId(2322114);
        mark.setName("Mark");
        mark.setAge(20);
        System.out.println(mark.getName() + "'s id is " + mark.getId() + " and is " + mark.getAge() + " years old.");

        Student tom = new Student(); //Tom -> object or instance
        mark.setId(1822964);
        mark.setName("Tom");
        mark.setAge(19);
        System.out.println(mark.getName() + "'s id is " + mark.getId() + " and is " + mark.getAge() + " years old.");
    }
}