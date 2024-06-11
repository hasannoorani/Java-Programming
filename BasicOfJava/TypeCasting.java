
public class TypeCasting {
    public static void main(String[] args) {

        //Implicit Casting or Widening Casting (automatically)
        //Example1
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double   
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        System.out.println("\n");

        //Example2
        // create int type variable
        int num = 10;
        System.out.println("The integer value: " + num);
        // convert into double type
        double data = num;
        System.out.println("The double value: " + data);
        
        System.out.println("\n");
              
        //Explicit Casting or Narrowing Casting
        //Example1
        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble1; // Manual casting: double to int
        System.out.println(myDouble1); // Outputs 9.78
        System.out.println(myInt1);    // Outputs 9
        
        System.out.println("\n");

        //Example2
        // create double type variable
        double num1 = 10.99;
        System.out.println("The double value: " + num1);
        // convert into int type
        int data1 = (int)num1;
        System.out.println("The integer value: " + data1);

        System.out.println("\n");
        
        //int to string
        int n = 5;
        String s = String.valueOf(n);
        System.out.println(s);
    }
}
