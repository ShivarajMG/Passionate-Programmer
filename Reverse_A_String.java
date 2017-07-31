package rev;
import java.util.*;
public class Reverse_A_String {

	public static void main(String[] args){
		System.out.println("Enter a string");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		
		StringTokenizer stk=new StringTokenizer(s1," ");
		
		while(stk.hasMoreTokens()==true){
			String words=stk.nextToken();
			char alpha[]=words.toCharArray();
			int m=words.length();
			
			for(int i=m-1;i>=0;i--){
				System.out.print(alpha[i]);
			}
			System.out.print(" ");
		}
	}
}
