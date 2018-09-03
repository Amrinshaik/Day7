package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	String s;

	public static int CountWords(String s) {
		int count = 0;

		File file = new File("C:\\Amrin\\amrintext.txt");
		try (FileReader fileReader = new FileReader(file); 
				BufferedReader reader = new BufferedReader(fileReader);) {
			s = reader.readLine();
			while (s != null) {
				String[] parts = s.split(" ");
				for (String x : parts) {
					count++;
				}
				s = reader.readLine();
				System.out.println("No of words in this line: " + count);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
}
