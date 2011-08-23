package student;
//StudentGroup by 212014 P2
//DOM 1/12/10

import java.text.DecimalFormat;

//represents a group of students
public class StudentGroup {
  
  private DecimalFormat dec = new DecimalFormat("0.00");
  
  private String className;
  private Student[] students;
  private double classAverageGPA;
  private int numStudents;
  private Student valedictorian;
  
  //accepts array of studenst and a class name
  public StudentGroup (Student[] s, String name)
  {
    students = s;
    className = name;
    numStudents = students.length;
    calcAvgGPA();
    findValedictorian();
  }
  
  //returns average gpa
  public double getAverageGPA () {
    return classAverageGPA;
  }
  
  //returns valedictorian
  public Student getValedictorian() {
    return valedictorian;
  }

public int getNumStudents() {
	return numStudents;
}

//finds valedictorian and assigns it to variable valedictorian
  private void findValedictorian(){
    int high = 0;
    for (int i=1; i<students.length; i++) if (students[i].getGPA()>students[high].getGPA()) high=i;
    valedictorian=students[high];
  }
  
  //calculates average gpa
  private void calcAvgGPA () {
    double sum = 0;
    for (Student i : students) sum+=i.getGPA();
    classAverageGPA = sum/students.length;
  }
  
  //prints class name, individuals' names and gpas, average gpa, and valedictorian
  public void printRoster() {
    System.out.println(className+':');
    for (Student i : students) System.out.println(String.format("%s GPA: %s", i, dec.format(i.getGPA())));
    System.out.println(String.format("\nAverage GPA: %s", dec.format(classAverageGPA)));
    System.out.println(String.format("\nYour valedictorian for 2010: %s", valedictorian));
  }
}