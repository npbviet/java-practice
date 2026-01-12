package Resume.Inheritance;

abstract class Employee {
    private int workingHours;
    private double salary;
    private int vacation;

    public Employee() {
        this.workingHours = 40;
        this.salary = 40000;
        this.vacation = 10;
    }

    public Employee(int workingHours, double salary, int vacation) {
        this.workingHours = workingHours;
        this.salary = salary;
        this.vacation = vacation;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public double getSalary() {
        return salary;
    }

    public int getVacation() {
        return vacation;
    }
}

public class Custodian extends Employee {

    public int getWorkingHours() {
        return super.getWorkingHours() * 2;
    }

    public double getSalary() {
        return super.getSalary() - 10000;
    }

    public int getVacation() {
        return super.getVacation() / 2;
    }

    public String clean() {
        return "Workin' for the man.";
    }


    public static void main(String[] args) {
        Custodian custodians = new Custodian();

        System.out.println("Working Hours: " + custodians.getWorkingHours());
        System.out.println("Salary: " + custodians.getSalary());
        System.out.println("Vacation Days: " + custodians.getVacation());
        System.out.printf("%s", custodians.clean());
    }
}