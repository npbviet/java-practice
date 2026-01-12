package Resume.Inheritance;

abstract class Lawyer {
    private int workingHours;
    private double salary;
    private int vacation;
    private String vacationForm;

    public Lawyer() {
        this.workingHours = 40;
        this.salary = 40000;
        this.vacation = 10;
        this.vacationForm = "pink";
    }

    public Lawyer(int workingHours, double salary, int vacation, String vacationForm) {
        this.workingHours = workingHours;
        this.salary = salary;
        this.vacation = vacation;
        this.vacationForm = vacationForm;
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

    public String getVacationForm() {
        return vacationForm;
    }
}

public class StanfordLawyer extends Lawyer {

    public int getWorkingHours() {
        return super.getWorkingHours() * 2;
    }

    public double getSalary() {
        return super.getSalary() * 1.2;
    }

    public int getVacation() {
        return super.getVacation() + 3;
    }

    public String getVacationForm() {
        String form = super.getVacationForm();
        return form + form + form + form;
    }


    public static void main(String[] args) {
        StanfordLawyer lawyers = new StanfordLawyer();

        System.out.println("Working Hours: " + lawyers.getWorkingHours());
        System.out.println("Salary: " + lawyers.getSalary());
        System.out.println("Vacation Days: " + lawyers.getVacation());
        System.out.printf("%s", lawyers.getVacationForm());
    }
}