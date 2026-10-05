import java.util.Scanner; 
class relational{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number:");
		int a=sc.nextInt();
		System.out.println("enter a second number:");
		int b=sc.nextInt();
		
		System.out.println("a=b("+a+" == "+b+"):" + (a==b));
		System.out.println("a!b("+a+" != "+b+"):" + (a!=b));
		System.out.println("a>b("+a+" > "+b+"):" + (a>b));
		System.out.println("a<b("+a+" < "+b+"):" + (a<b));



		}
}