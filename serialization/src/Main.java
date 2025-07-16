import java.io.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Administrator boss = new Administrator("Juan", 80000, 2005, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Ana", 25000, 2008, 10, 1);
        staff[2] = new Employee("Luis", 18000, 2012, 9, 15);


        try {

            //ObjectOutputStream writingFile = new ObjectOutputStream(new FileOutputStream("src/employees.dat"));

            //writingFile.writeObject(staff);

            //writingFile.close();

            ObjectInputStream readingFile = new ObjectInputStream(new FileInputStream("src/employees.dat"));

            Employee[] recoveredStaff = (Employee[]) readingFile.readObject();

            readingFile.close();

            for (Employee e : recoveredStaff) {
                System.out.println(e);
            }

        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }


    }
}

class Employee implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private double salaries;
    private Date contractDate;


    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salaries = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        contractDate = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalaries() {
        return salaries;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void raiseSalary(double byPercent) {
        double raise = salaries * byPercent / 100;
        salaries += raise;
    }

    public String toString() {
        return "Employee[name=" + name + ", salary=" + salaries + ", contractDate=" + contractDate + "]";
    }
}

class Administrator extends Employee {
    @Serial
    private static final long serialVersionUID = 1L;

    private double bonus;

    public Administrator(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public double getSalaries() {
        double baseSalary = super.getSalaries();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Administrator[name=" + getName() + ", salary=" + getSalaries() + ", contractDate=" + getContractDate() + ", bonus=" + bonus + "]";
    }
}