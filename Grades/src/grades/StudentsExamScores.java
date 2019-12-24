package grades;

public class StudentsExamScores 
{
	public static void main(String[] args) 
	{
		Grades grades = new Grades("Jason Wiley", "Science", 5, 360.2);
		
		System.out.printf("Student Name: %s\n", grades.getName());
		System.out.printf("Subject Class: %s\n", grades.getSubjectName());
		System.out.printf("Average Grade: %.01f", grades.getAverageGrades());
		
	}
}