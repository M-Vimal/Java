import java.io.BufferedReader;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class LaunchReadLines {

	public static void main(String[] args) {
		int count = 0;
		File file = new File("TextFiles/result.txt");
		try{
			if(file.createNewFile()) {
				System.out.println("file created");
			}
			else {
				System.out.println("already exists");	
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("TextFiles/result.txt"));
					BufferedReader br = new BufferedReader(new FileReader("TextFiles/data.txt"))){
		        
				String line;
		        	while ((line = br.readLine())!=null){
			        	if(!line.isEmpty()) {
			        		count+=1;
			        	}
		        	}
		        	bw.write("the line count is  -" + count);
		        	System.out.println(count);
		           }
				
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}

	}

}
