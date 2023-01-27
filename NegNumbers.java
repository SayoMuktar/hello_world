package inrotojava;
import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		int num1 = 0;

		System.out.println("Enter number:");

		// numaric input
		num1 = scanner.nextInt();
		    
		if(num1 > 0) {
		    System.out.println("Entered Number : " + num1 + " is posetive"); 
		}else if (num1 < 0){
		
			System.out.println("Entered Number : " + num1 + " is nagative"); 
		}else {
			System.out.println("Entered Number : " + num1 + " is neither posetive nor nagative"); 
		}

		scanner.close();

	}

}

public class NegNumbers {

    public static void main(String[] args) {
        // Paste your code here. 

        
    }

}
