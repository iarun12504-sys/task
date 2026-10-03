import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("choose an operation:\n(+)\n(-)\n(*)");
		char choice=sc.next().charAt(0);
		switch(choice){
		case '+':
			System.out.println("addition");
			break;
		case '-':
			System.out.println("subraction");
			break;
		case '*':
			System.out.println("multiplication");
			break;
		default:
		System.out.println("invalid selection !pls run again.");
		sc.close();
		return;
		}
		System.out.println("enter the first number:");
		int a=sc.nextInt();  
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		switch(choice){
		case '+':
			System.out.println(a+ "+" +b+ "=" + (a+b));
			break;
		case '-':
			System.out.println(a+ "-" +b+"=" + (a-b));
			break;
		case '*':
			System.out.println(a+ "*" +b+"=" + (a*b));
			break;

		}

		sc.close();

}
}