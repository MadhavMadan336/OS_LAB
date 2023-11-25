//WRITE A PROGRAM IN JAVA TO SHOW THE USEFULNESS OF INTERFACES AS A PLACE TO KEEP THE CONSTANT VALUE OF THE PROGRAM

package EXPERIMENT_4;

//Interface 'area' with a constant 'pi' and a method 'compute'
interface area {
 static final float pi = 3.142f;
 float compute(float x, float y);
}

//Class 'rectangle' implementing 'area' interface
class rectangle implements area {
 public float compute(float x, float y) {
     return (x * y);
 }
}

//Class 'circle' implementing 'area' interface
class circle implements area {
 public float compute(float x, float y) {
     return (pi * x * x);
 }
}

//Main class
public class usefulness_of_interfaces {
 public static void main(String args[]) {
     // Create instances of rectangle and circle
     rectangle rect = new rectangle();
     circle cr = new circle();
     area ar;

     // Use 'rect' to compute area of a rectangle
     ar = rect;
     System.out.println("Area of the rectangle= " + ar.compute(10, 20));

     // Use 'cr' to compute area of a circle
     ar = cr;
     System.out.println("Area of the circle= " + ar.compute(10, 0));
 }
}
