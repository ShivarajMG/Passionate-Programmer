import java.util.*;
public class RevAno {
public static void main(String[] args){
	
	int n,rev,digit;
	Scanner scan=new Scanner(System.in);
	 System.out.println("Enter a number to reverse");
	 n=scan.nextInt();
	 int n1=n;
	 rev=0;
	 while(n!=0){
		 digit=n%10;
		 rev=rev*10+digit;
		 n=n/10;
	 }
	System.out.println("Reversed number is "+rev);
}
}
