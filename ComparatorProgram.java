package Numbers;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
	int age, rollNo;
	String name;

	Student(int roll, String name, int age) {
		this.age = age;
		this.name = name;
		this.rollNo = roll;
	}
	
	public String toString() {
		return "rollno: " + rollNo + " name: " + name + " age: " + age;
	}

}

class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) { 
		return s1.name.compareTo(s2.name);
	}

}

class RollComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.rollNo - s2.rollNo;
	}
}

public class ComparatorProgram {
	public static void main(String[] args) {
		List<Student> li = new ArrayList<Student>();
		li.add(new Student(101, "Ajay", 23));
		li.add(new Student(102, "vijay", 33));
		li.add(new Student(103, "vinyak", 43));
		li.add(new Student(104, "Anjula", 53));
		li.add(new Student(105, "manjula", 63));

		System.out.println("Sorting by name");
		Collections.sort(li, new NameComparator());
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println();
		System.out.println("Sort by rollno");
		Collections.sort(li, new RollComparator());
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}

	}

}
