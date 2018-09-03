package com.capgemini.day7.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.MyDate2;

class MyDate2Test {

	@Test
	void testMyDateArray() {
		MyDate2 date1 = new MyDate2(LocalDate.of(2017, 05, 16));
		MyDate2 date2 = new MyDate2(LocalDate.of(2012, 07, 13));
		MyDate2 date3 = new MyDate2(LocalDate.of(2016, 03, 16));

		ArrayList<MyDate2> al = new ArrayList<>();
		al.add(date1);
		al.add(date2);
		al.add(date3);

		ArrayList<MyDate2> result = new ArrayList<>();

		try (FileOutputStream fileOutput = new FileOutputStream("C:\\Amrin\\amrintext.txt");
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
			objectOutput.writeObject(al);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fileInput = new FileInputStream("C:\\Amrin\\amrintext.txt");
				ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
			result = (ArrayList<MyDate2>) objectInput.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	}
