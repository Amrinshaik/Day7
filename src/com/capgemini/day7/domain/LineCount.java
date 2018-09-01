package com.capgemini.day7.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {

public static int CountLine(String s) {
	int count=0;

	File file =new File("C:\\Amrin\\amrintext.txt");
	try(FileReader fr = new FileReader(file);
			BufferedReader reader =new BufferedReader(fr);)
	{
				
				while((s=reader.readLine())!=null) 
					count++;
				System.out.println("No of Lines: " +count);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	return count;
}

}
