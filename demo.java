import java.util.Scanner;
class demo{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a age:");
		int age =sc.nextInt();
		
		if(age >=18){
			System.out.println("you are eligible");
		}else{

			System.out.println("you are not eligible");
}
}
}