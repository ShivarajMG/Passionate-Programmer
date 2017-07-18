import java.util.*;
public class EvenOrodd {
	public static void main(String[] args){
	
	System.out.println("Enter a number:");
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	
	if(n%2==0){
		System.out.println("Even Number");
	}
	else if(n%2==1){
		System.out.println("Odd number");
	}
  }
}
