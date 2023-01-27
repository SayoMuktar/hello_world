import java.util.Scanner;

class Main {

  private static String favCity; 

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter name, favorite city, age,  and salary:");

    // String input
    String name = scanner.nextLine();

    // string input initializing variable that previously declared
    favCity = scanner.nextLine();

    // Numerical input - integer
    int age = scanner.nextInt();

    // numeric input - double
    double salary = scanner.nextDouble();

    // Output input by user
    System.out.println("Name: " + name); 
    System.out.println("Favorite city: " + getFavCity());
    System.out.println("Age: " + age); 
    System.out.println("Salary: " + salary);

    scanner.close();
  }

  private static String getFavCity(){
      return favCity;
  }
}
        int sum = num1 + num2;
        System.out.println("Sum of the two numbers entered: ");
        num1 = scanner.nextInt();
         
     

    
  }
}