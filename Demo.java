
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
	
	if(n>0){
		System.out.println("Positive");
	}
	else if(n<0){
		System.out.println("Negetive");
	}
	else if(n==0){
		System.out.println("zero");
	}
	else{
		System.out.println("invalid input");
	}
	}
}
