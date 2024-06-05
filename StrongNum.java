import java.util.Scanner;
public class StrongNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int original=n;
		while (n>0){
			int fact=0;
			int rem=n%10;
		
			for (int i=rem; i>=0;i--) 
				fact= fact*i;
			sum=sum+fact;
			n=n/10;
		
	    	}
		
		        if (sum==original)
					System.out.println( "the given number is strong num ....."+n);
				
 	          else
               System.out.println("the given number is not strong num ...." +n);
		     
}
}
