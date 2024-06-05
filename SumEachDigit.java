
public class SumEachDigit {
 
	public static void main(String[] args) {
int[] arr= {78,124,467,107,8294,7678};
for (int i=0 ; i<=arr.length-1; i++) {
	int sum=0;
	while(arr[i]>0) {
		int rem= arr[i]%10;
		sum=sum+rem;
		arr[i]=arr[i]/10;
		
	}
	System.out.println("sum of  each digit is"+sum);
	
}

	}

}
