import java.util.Scanner;
public class ReadChar {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);
        System.out.println("The character is: \n"+ch);
     
        System.out.print("\n");

        System.out.println("Enter the character:");
		  char ch1 = sc.next().charAt(5);
		  System.out.println("The character is = "+ch1);
	}
	
}

