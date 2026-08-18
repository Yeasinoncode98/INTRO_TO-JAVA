
class Employee {

    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

abstract class PermanentEmployee extends Employee {

    double bonus;

    public PermanentEmployee(double bonus, String name, int id, double salary) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}

class FullTimeEmployee extends PermanentEmployee {

    FullTimeEmployee(double bonus, String name, int id, double salary) {
        super(bonus, name, id, salary);
    }

}

class ContractPeriod extends Employee {

    int contractPeriod;

    public ContractPeriod(int contractPeriod, String name, int id, double salary) {
        super(name, id, salary);
        this.contractPeriod = contractPeriod;
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}

public class Emp {

    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(10000, "Yeasin", 100, 50000);
        Employee emp2 = new ContractPeriod(12, "Arafat", 102, 40000);

        System.out.println("Permanent Employee: " + emp1.calculateSalary());
        System.out.println("Contract Employee: " + emp2.calculateSalary());
    }
}
