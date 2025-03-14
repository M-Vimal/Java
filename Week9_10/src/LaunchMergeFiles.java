

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class LaunchMergeFiles {

	public static void main(String[] args) {
		
		File file = new File("TextFiles/merged.txt");
		try{
			if(file.createNewFile()) {
				System.out.println("file created");
			}
			else {
				System.out.println("already exists");
				System.out.println(file.getAbsolutePath());
				
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("TextFiles/merged.txt"))){
		        try (BufferedReader br = new BufferedReader(new FileReader("TextFiles/file1.txt"))){
		        	String line1 = br.readLine();
		        	bw.write(line1);
		        	bw.write("\n");
		           }
		        try (BufferedReader br = new BufferedReader(new FileReader("TextFiles/file2.txt"))){
		        	String line2 = br.readLine();
		        	bw.write(line2);
		        	bw.write("\n");

		        }
		        try (BufferedReader br = new BufferedReader(new FileReader("TextFiles/file3.txt"))){
		        	String line3 = br.readLine();
		        	bw.write(line3);
		        	bw.write("\n");

		           }
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
