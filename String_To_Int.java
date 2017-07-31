package guvi;
import java.util.*;
public class String_To_Int {
	public static void main(String args[]){
	int i;
	String s1;
	System.out.println("Enter a number of String type");
	Scanner scan=new Scanner(System.in);
	s1=scan.next();
	i=Integer.parseInt(s1);
	System.out.println("Integer after conversion is: "+i);
	}
}
