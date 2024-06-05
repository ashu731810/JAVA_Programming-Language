import java.util.Scanner;

public class CheakInsurance {

	public static void main(String[] args) {
 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the sex");
		String sex= sc.next();
		System.out.println("enter maried status");
		String status= sc.next();
		
          if(sex.equals("m") && status.equals("unmarried")&&age>30)
        	  System.out.println("it has insured ");
          
          else if (sex.equals("f") && status.equals("unmarried") && age>25)
            System.out.println("it has insured ");
          else
            System.out.println(" it hasn't insured" );
	}

}
