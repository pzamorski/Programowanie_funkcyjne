package org.materialy;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private Long id;
	private String name;
	private String surname;
	private Level level;
	private List<Double> marks;

	private static long COUNTER = 0L;

	public Student(String name, String surname, Level level) {
		this.name = name;
		this.surname = surname;
		this.level = level;
		this.marks = new ArrayList<>();
		this.id = COUNTER;
		COUNTER++;
	}

	public void addMark(Integer mark) {
		if (isMarkVaild(mark)) {
			marks.add(Double.valueOf(mark));
		}
	}
	
	public Double getAverageGrade(){
		double result = 0;
		for (Double mark : marks) {
			result += mark;
		}
		return result / marks.size();
	}

	private boolean isMarkVaild(Integer mark){
		return mark > 0 && mark <= 6;
	}


	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public List<Double> getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student{" +
			"id=" + id +
			", name='" + name + '\'' +
			", surname='" + surname + '\'' +
			", level=" + level +
			'}';
	}
}
