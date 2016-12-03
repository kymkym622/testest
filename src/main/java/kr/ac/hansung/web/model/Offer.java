package kr.ac.hansung.web.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Offer {
	int year;
	int semester;
	String code;
	String title;
	String type;
	int grades;

	public Offer() {

	}

	public Offer(int year,int semeseter,String code,String title,String type,int grades) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.title = title;
		this.type = type;
		this.grades = grades;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getGrades() {
		return grades;
	}

	public void setGrades(int grades) {
		this.grades = grades;
	}
	public String toString() {
		return "Offer [ year=" + year + ", code=" + code + ", title=" + title + ", type=" + type+ ", grades=" + grades+"]";
	}
}
