package com.capgemini.day7;

import java.time.LocalDate;
import java.util.LinkedList;

public class Assignment {
	String subject;
	LocalDate date;
	public Assignment() {
		super();
	}
	
	private static LinkedList<Assignment> list=new LinkedList<>();
	
	public Assignment(String subject, LocalDate date) {
		super();
		this.subject = subject;
		this.date = date;
	}

	public static boolean adding(Assignment assignment) {
		if(list.add(assignment))
			return true;
			else
				return false;
	}

	public static boolean remove(Assignment assignment) {
		if(list.remove(assignment))
			return true;
		else
			return false;
	}

	public static void show() {
for (Assignment assignment : list) {
	System.out.println(assignment);
}		


	}

	public static Object search() {
		int result = 0;
		Assignment early = list.getFirst();
		for (Assignment assignments : list) {
			if (early.equals(assignments)) {
				continue;
			}
			result = assignments.date.compareTo(early.date);
			System.out.println(result);
			if (result < 0) {
				early = assignments;
			}
		}
		System.out.println(early);
		return early;
	}
	
	
	
}
