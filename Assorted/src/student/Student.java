package student;
//Student by 212014 P2
//DOM 1/12/10

//represents a student object
public class Student {
  
  private String first;
  private String last;
  private double gpa;
  
  //constructor with default gpa of 0
  public Student (String first, String last) {
    this.first = first;
    this.last = last;
    this.gpa = 0;
  }
  
  //constructor with inputted gpa
  public Student (String first, String last, double gpa) {
    this.first = first;
    this.last = last;
    this.gpa = gpa;
  }
  
  //returns first and last name
  public String toString () {
    return String.format("%s, %s", last, first);
  }
  
  //returns gpa
  public double getGPA () {
    return gpa;
  }
}