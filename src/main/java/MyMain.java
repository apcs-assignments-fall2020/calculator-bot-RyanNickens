import java.util.Scanner;
//import java.lang.Math;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int d = Math.max(a, b);
        int e = Math.max(b, c);
        int f = Math.max(a, c);

        if (d != b && e == b) {
          return b;
        }
        if (d == b && e != b) {
          return b;
        }
        if (e != c && f == c) {
          return c;
        }
        if (e ==c && f !=c) {
          return c;
        }
        else {
          return a;
        }
        //return 0; 
    }
     

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int c = Math.abs(a);
        int d = Math.abs(b);
        int e = Math.max(c, d);
        if (e == d){
          return b;
        }
        else {
          return a;
        } 
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double x = Math.pow(a, 2);
        double y = Math.pow(b, 2);
        double c = x + y;
        double h = Math.sqrt(c);
        return h; 
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.print("What command would you like to carry out?" + " median, magnitude, or pythagoras?");
        
        String name = scan.next();

        if (name.equals("median")) {
          System.out.print("give a number");
          int a = scan.nextInt();
          System.out.print("give another number");
          int b = scan.nextInt();
          System.out.print("give a final number");
          int c = scan.nextInt();
          System.out.println("the median is " + median(a, b, c));
        }

        if (name.equals("magnitude")) {
          System.out.print("give a number");
          int a = scan.nextInt();
          System.out.print("give another number");
          int b = scan.nextInt();
          System.out.println("The largest absolute value is " + magnitude(a, b));

        }

        if (name.equals("pythagoras")) {
          System.out.print("give a number");
          int a = scan.nextInt();
          System.out.print("give another number");
          int b = scan.nextInt();
          System.out.println("the thrid number is " + pythagoras(a, b));
        }

        

        // YOUR CODE HERE
    }
}
