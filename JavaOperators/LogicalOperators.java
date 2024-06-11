public class LogicalOperators {
    public static void main(String[] args) {

        // && operator (Logical AND)
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator (Logical OR)
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false
  
        // ! operator (Logical NOT)
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
    
    }
}
