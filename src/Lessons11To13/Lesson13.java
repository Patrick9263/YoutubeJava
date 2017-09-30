package Lessons11To13;
/*Access Levels
Modifier        Class   Package Subclass    World
public          Y       Y       Y           Y
protected       Y       Y       Y           N
no modifier     Y       Y       N           N
private         Y       N       N           N
*/

/* static members belong to the class instead of a specific instance.
    If it's static, you DON'T need to make an instance,
    if it's NOT static, you NEED to make an instance.
    Example instance:
    Hello hello = new Hello();
 */

/*final keyword
-Cannot be subclassed
-Cannot be overridden by subclasses
-can only be initialized once
 */

/* Classes in Java can be extended,
    creating new classes which retain
    characteristics of the base class.
 */
public class Lesson13 {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle();
        Triangle shape2 = new Triangle();
        shape1.set_values(10.5,10.8);
        shape2.set_values(10.1,10.8);
        System.out.println("Rectangle area = " + shape1.area());
        System.out.println("Triangle area = " + shape2.area());
    }
}
