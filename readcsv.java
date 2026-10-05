import java.io.BufferedReader;
import java.io.FileReader;

public class readcsv{
	public static void main (String[]args){
		String filepath = "marksheet.csv";
		String line="";
		
		try(BufferedReader br=new BufferedReader(new FileReader(filepath))){
		System.out.println("=================================================================");
	System.out.println("                    MARKSHEET DETAILS                           ");
	System.out.println("=================================================================");

			while((line = br.readLine()) !=null){

				String[]values = line.split(",");
				for(String val: values){

				System.out.printf("%-15s",val.trim());
		}
		System.out.println();
		}

	System.out.println("=================================================================");

}catch (Exception e){

		System.out.println("error:"+e.getMessage());
}
}
}