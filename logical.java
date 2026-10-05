import java.util.Scanner;
class logical{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a mark:");
		int mark=sc.nextInt();
		if(mark>=35 && mark<=100){
			System.out.println("result: pass");
		}else{
		System.out.println("result:fail or inavalid");
}
}
}


