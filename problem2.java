// problem 2 - university examination and result processing System 
abstract class Student{
    private String studentId;
    private String name;
    protected double marks;

    public Student(String studentId,String name , double marks){
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public String getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }

    abstract double calculateResult();

        public void displayResult(){
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("FINAL SCORE: " + calculateResult());
            System.out.println("Calculating the Result on Processing--!!");
        }
}


    class RegularStudent extends Student{
        public RegularStudent(String studentId,String name,double marks){
            super(studentId,name,marks);
        }
        @Override
        double calculateResult(){
            return marks;
        }
    }

class ScholarshipStudent extends Student{
    public ScholarshipStudent(String studentId , String name , double marks){
        super(studentId,name,marks);
    }
    @Override
    double calculateResult(){
        if(marks >= 80){
            return marks + 10;
        }
        return marks;
    }
}

class ResultProcessor{
    public void processResult(Student student){
        student.displayResult();
    }
}

public class problem2{
    public static void main(String[] args) {
        Student s1 = new RegularStudent("R101", "Jamal", 76);
        Student s2 = new ScholarshipStudent("S201", "Rashed", 85);
        Student s3 = new ScholarshipStudent("S202", "Shuvo", 70);

        ResultProcessor processor = new ResultProcessor();
        processor.processResult(s1);
        processor.processResult(s2);
        processor.processResult(s3);
    }
}
