import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		String st=" ";
		Scanner sc =new Scanner(System.in);
		System.out.println("Eneter  the String ");
		String st1=sc.nextLine();
		//st1+=" ";
		System.out.println("st1="+st1);
		String []st2=st1.split(" ");
		//System.out.println("st2"+st2);
		for(String s1:st2)
		{
			System.out.println("st2"+s1);
		}
		for(int i=0;i<st2.length-1;i++)
		{
			
			if(st2[i].length()>st2[i+1].length())
			{
				st+=st2[i];
				System.out.println(st);
			}
		}
		System.out.println("longest word="+st);
	}

}
