import java.io.FileWriter;    
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class addcsv{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		String filepath = "marksheet.csv";  
		System.out.println("================================================================");
	System.out.println("                ADD MARKSHEET DETAILS                           ");
	System.out.println("================================================================");

	System.out.println("enter ID:");
	String id =sc.nextLine();

	System.out.println("enter STUDENT:");
	String student =sc.nextLine();

	System.out.println("enter MARK:");
	String mark =sc.nextLine();

	System.out.println("enter SUB:");
	String sub =sc.nextLine();

	try(FileWriter fw = new FileWriter(filepath,true);
	PrintWriter pw = new  PrintWriter(fw)){

	pw.println(id+ "," + student + " , "+ mark + "," + sub );


	System.out.println("================================================================");
	System.out.println("   success: details saved into"+filepath+"!");
	System.out.println("================================================================");

}catch (Exception e){  

		System.out.println("error saving file:"+e.getMessage());
}
	sc.close();
} 
}       