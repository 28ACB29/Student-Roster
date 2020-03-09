/**
 * 
 */
package com.arthurcbaroi.roster;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author arthu
 *
 */
public class CSVUtil
{
	private CSVParser csvParser;

	/**
	 * 
	 */
	public CSVUtil()
	{
		// TODO Auto-generated constructor stub
		this.csvParser = null;
	}

	public List<Student> parse(MultipartFile file)
	{
		List<Student> students;
		String[] dateParts;
		GregorianCalendar date;
		try
		{
			this.csvParser = new CSVParser(new InputStreamReader(file.getInputStream()), CSVFormat.DEFAULT);
			students = new ArrayList<Student>();
			for (CSVRecord record : this.csvParser)
			{
				dateParts = record.get("entryDate").split("/");
				date = new GregorianCalendar(Integer.parseInt(dateParts[2]), Integer.parseInt(dateParts[0]), Integer.parseInt(dateParts[1]));
				new Student(Integer.parseInt(record.get("schoolYr")), Integer.parseInt(record.get("Campus")), Integer.parseInt(record.get("studentID")), date, Integer.parseInt(record.get("gradeLevel")), record.get("name"));
			}
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			students = null;
		}
		return students;
	}

}
