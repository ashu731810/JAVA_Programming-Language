	
public class BinaryToDecimal {

	public static void main(String[] args) {
     int [] arr= {1100,0011,1110,1111};
     for(int i=0;i<=arr.length-1;i++) {
    	 int DecNumber=0;
    	 int base=1;
    	 while(arr[i]>0) {
    		 int rem=arr[i]%10;
    		 DecNumber=DecNumber+rem*base;
    		 base=base*2;
    		 arr[i]=arr[i]/10;
    		 
    	}
	System.out.println("DecNumber for index("+i+")"+"is="+" "+ DecNumber);
     }
	}
}
