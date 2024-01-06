package Triangle;
public class Triangle {
 // single attribute with public access
   public int width;
   
 // default constructor - no arguments (initialize the width to 1) 
   public Triangle() {
      //TODO
      this.width=1;
   }
   
 // perameterized constructoe 
   public Triangle(int width) {
      this.width = width;
   }
   
 //copy constructor
   public Triangle(Triangle t) {
      this(t.width);
   }
   
 //area method - retuen the area of the triangle pbject
   public double area() {
      //TODO
      return width * width / 2.0;
   }
   
 // perimeter method - retuen the sum of all sides in our triangle
   public double perimeter() {
      double hypotenuse = Math.sqrt(2 * (width * width)); // calclute the third side of the triangle 
      return hypotenuse + 2 * width; // returrn the sum of sides 
   }
   
 // draw a triangle of repeating characters using the width of define a for loop
   public void draw (char c) {
      //TODO
      for (int i = 1; i <=width; i++) {
         for (int j=1; j<=i; j++) {
            System.out.print(c);
         }
         System.out.println();
      }
   }  
   
   public static void main(String[] args) {
      Triangle triangle1 = new Triangle(); // No-args constructor
      
      System.out.printf("triangle1's width: %d\n", triangle1.width);
      System.out.printf("triangle1's perimeter: %.2f\n", triangle1.perimeter());
      System.out.printf("triangle1's area: %.2f\n", triangle1.area());
      triangle1.draw('*');
      System.out.printf("----------------------------------------\n");

      Triangle triangle2 = new Triangle(5); // Parametrized constructor
      
      System.out.printf("triangle2's width: %d\n", triangle2.width);
      System.out.printf("triangle2's perimeter: %.2f\n", triangle2.perimeter());
      System.out.printf("triangle2's area: %.2f\n", triangle2.area());
      triangle2.draw('+');
      System.out.printf("----------------------------------------\n");
      
      Triangle triangle3 = new Triangle(triangle2); // Copy constructor
      
      System.out.printf("triangle3's width: %d\n", triangle3.width);
      System.out.printf("triangle3's perimeter: %.2f\n", triangle3.perimeter());
      System.out.printf("triangle3's area: %.2f\n", triangle3.area());
      triangle3.draw('^');
      System.out.printf("----------------------------------------\n");

  } //end-main
} //end-Test
  