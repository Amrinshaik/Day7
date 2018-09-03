package com.capgemini.day7;

import java.util.Objects;

public class RandomRange implements Comparable<RandomRange> {
	private int number;

	public RandomRange(int number) {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RandomRange other = (RandomRange) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  number+" " ;
	}
	@Override
	public int compareTo(RandomRange o) {
		return Integer.compare(this.number,o.number);
	}


}
