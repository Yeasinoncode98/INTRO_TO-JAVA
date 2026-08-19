
interface Notification {

    void sendNotifications(String message);

}

abstract class User implements Notification {

    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void digitalCampus();

}

class Student extends User {

    Student(String name, int id) {
        super(name, id);
    }

    @Override
    void digitalCampus() {
        System.out.println(name + "Entered the campus as a Student");
    }

    @Override
    public void sendNotifications(String message) {
        System.out.println("Student Notification : " + message);
    }
}

class Teacher extends User {

    Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    void digitalCampus() {
        System.out.println(name + "Entered the campus as a Teacher");
    }

    @Override
    public void sendNotifications(String message) {
        System.out.println("Teacher Notification : " + message);
    }
}

public class MakingCampusSafe {

    public static void main(String[] args) {

        User student = new Student("Yeasin", 101);
        User teacher = new Teacher("Karim sir", 102);

        Notification n1 = new Student("Yeasin", 101);
        Notification n2 = new Teacher("karim sir", 102);

        n1.sendNotifications("Class Reminder");
        n2.sendNotifications("Exam Reminder");

        student.digitalCampus();
        teacher.digitalCampus();

    }
}
