
class Employee {

    String name;
    int ID;
    double salary;

    public Employee(String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }

}

abstract class PermanentEmployee extends Employee {

    double bonus;

    public PermanentEmployee(String name, int ID, double salary, double bonus) {
        super(name, ID, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }

}

class FullTimeEmployee extends PermanentEmployee {

    FullTimeEmployee(String name, int ID, double salary, double bonus) {
        super(name, ID, salary, bonus);
    }
}

class contractEmployee extends Employee {

    int contractPeriod;

    public contractEmployee(String name, int ID, double salary, int contractPeriod) {
        super(name, ID, salary);
        this.contractPeriod = contractPeriod;
    }

    @Override
    double calculateSalary() {
        return salary;
    }

}

public class spring25 {

    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Yeasin", 101, 50000, 10000);
        Employee emp2 = new contractEmployee("Ara", 102, 40000, 12);

        System.out.println("permanent Emp Salary: " + emp1.calculateSalary());
        System.out.println("Contract  Emp Salary: " + emp2.calculateSalary());
    }

}
