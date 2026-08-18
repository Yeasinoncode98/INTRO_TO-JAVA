
interface Notification {

    void sendNotification(String message);

}

abstract class User implements Notification {

    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void digitalAccess();

}

class Student extends User {

    Student(String name, int id) {
        super(name, id);
    }

    @Override
    void digitalAccess() {
        System.out.println(name + "Logged in campus as a student: " + "ID is :" + id);
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Student Notification: " + message);
    }
}

class Teacher extends User {

    Teacher(String name, int id) {
        super(name, id);
    }

    @Override
    void digitalAccess() {
        System.out.println(name + "Logged in campus as a Teacher: " + "ID is :" + id);
    }
 
    @Override
    public void sendNotification(String message) {
        System.out.println("Teacher Notification: " + message);
    }
}

public class CampusNoti {

    public static void main(String[] args) {

        User student = new Student("Yeasin", 100);
        User teacher = new Teacher("Karim", 102);

        student.digitalAccess();
        teacher.digitalAccess();

        Notification n1 = new Student("Yeasin", 100);
        Notification n2 = new Teacher("Karim", 101);

        n1.sendNotification("Class Reminder");
        n2.sendNotification("Exam Reminder");
    }
}
