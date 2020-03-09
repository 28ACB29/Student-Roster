/**
 * 
 */
package com.arthurcbaroi.roster;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author arthu
 *
 */
@Entity
public class Student
{
	private int schoolYear;
	private int Campus;
	@Id
	private int studentID;
	private GregorianCalendar entryDate;
	private int gradeLevel;
	private String name;

	/**
	 * 
	 */
	private Student()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param schoolYear
	 * @param Campus
	 * @param studentID
	 * @param entryDate
	 * @param gradeLevel
	 * @param name
	 */
	public Student(int schoolYear, int Campus, int studentID, GregorianCalendar entryDate, int gradeLevel, String name)
	{
		this.schoolYear = schoolYear;
		this.Campus = Campus;
		this.studentID = studentID;
		this.entryDate = entryDate;
		this.gradeLevel = gradeLevel;
		this.name = name;
	}

	public int getSchoolYear()
	{
		return schoolYear;
	}

	public void setSchoolYear(int schoolYear)
	{
		this.schoolYear = schoolYear;
	}

	public int getCampus()
	{
		return Campus;
	}

	public void setCampus(int campus)
	{
		this.Campus = campus;
	}

	public GregorianCalendar getEntryDate()
	{
		return entryDate;
	}

	public void setEntryDate(GregorianCalendar entryDate)
	{
		this.entryDate = entryDate;
	}

	public int getGradeLevel()
	{
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel)
	{
		this.gradeLevel = gradeLevel;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
