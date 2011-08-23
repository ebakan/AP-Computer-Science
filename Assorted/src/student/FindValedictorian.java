package student;


//demos Student and StudentGroup
public class FindValedictorian {
  
  public static void main (String[] args) {
    
    //students
    Student[] students = new Student[3];
    students[0]=new Student("Steven", "Chu");
    students[1]=new Student("Mukund", "Chillakanti", 4);
    students[2]=new Student("Eric", "Bakan", 5);
    
    StudentGroup studentClass = new StudentGroup(students, "Peoples");
    
    studentClass.printRoster();
    
  }
}
