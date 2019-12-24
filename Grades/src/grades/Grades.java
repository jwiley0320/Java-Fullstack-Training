package grades;

public class Grades 
{
	private String name;
	private String subjectName;
	private int totalExams;
	private double totalGrades;
	private double averageGrades;
	
	public Grades(String name, String subjectName, int totalExams, double totalGrades) 
	{
		this.name = name;
		this.subjectName = subjectName;
		if(totalExams >= 0)
			this.totalExams = totalExams;
		else
			System.out.println("There is an error Total Exams Grades needs to be greater than 0!\n");
		if(totalGrades >= 0.0)
			this.totalGrades = totalGrades;
		else
			System.out.println("There is an error Total Grades needs to be greater than 0!\n");
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getSubjectName() 
	{
		return subjectName;
	}
	public void setSubjectName(String subjectName) 
	{
		this.subjectName = subjectName;
	}
	public int getTotalExams() 
	{
		return totalExams;
	}
	public void setTotalExams(int totalExams) 
	{
		if(totalExams >= 0)
			this.totalExams = totalExams;
		else
			System.out.println("There is an error Total Exams Grades needs to be greater than 0!\n");
	}
	public double getTotalGrades() 
	{
		return totalGrades;
	}
	public void setTotalGrades(double totalGrades) 
	{
		if(totalGrades >= 0.0)
			this.totalGrades = totalGrades;
		else
			System.out.println("There is an error Total Grades needs to be greater than 0!\n");
	}
	public double getAverageGrades() 
	{
		averageGrades = totalGrades / totalExams;
		return averageGrades;
	}
}