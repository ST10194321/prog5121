/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f.testcircle;

/**a. Create a class named Circle with fields named radius, diameter, and area.
Include a constructor that sets the radius to 1 and calculates the other two values. Also
include methods named setRadius()and getRadius(). The setRadius() method
not only sets the radius, it also calculates the other two values. (The diameter of a circle
is twice the radius, and the area of a circle is pi multiplied by the square of the radius.
Use the Math class PI constant for this calculation.) Save the class as Circle.java.
b. Create a class named TestCircle whose main() method declares several Circle
objects. Using the setRadius() method, assign one Circle a small radius value,
and assign another a larger radius value. Do not assign a value to the radius of the
third circle; instead, retain the value assigned at construction. Display all the
values for all the Circle objects. Save the application as TestCircle.java.
 *
 * @author josegonzalves
 */
public class Circle {
    //variables  
    static double radius;
    static double diameter;
    static double area;
    
    //constructor methods
    public Circle(){
       radius = 1;
        diameter = 2 * radius;
        area = (radius * radius)* Math.PI;
    }
    //methods
    public void setRadius(double r){
        radius = r;
        diameter = 2 * radius;
        area = (radius * radius)* Math.PI;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public String toString() {
        return "\nRadius:" + radius + "\nDiameter:" + diameter + "\nArea:" + area;
    }
    
    
    
}
