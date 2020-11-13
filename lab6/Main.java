package labs.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void problem1_averageColumns(String inFileName, String outFileName){
		try(Scanner in = new Scanner(new File(inFileName))){
			double col1Total = 0;
			double col2Total = 0;	
			int num = 0;
			boolean side = true;
			while(in.hasNext()) {
				if(side) {
					col1Total+=in.nextDouble();
					num++;
				}else{
					col2Total+=in.nextDouble();
				}
				side = !side;
			}
			try(PrintWriter out = new PrintWriter(outFileName)){
				out.println(col1Total/num);
				out.println(col2Total/num);
			}			
		}catch(FileNotFoundException e) {
			System.out.println("File: "+inFileName+" not found");
		}
	}
	
	public static void main(String[] args) {
		problem1_averageColumns("./src/labs/lab6/columns.txt", "./src/labs/lab6/output.txt");
	}
}