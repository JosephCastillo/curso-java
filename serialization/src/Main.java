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
            ObjectOutputStream writingFile = new ObjectOutputStream(new FileOutputStream("src/employees.dat"));

            writingFile.writeObject(staff);

            writingFile.close();

            ObjectInputStream readingFile = new ObjectInputStream(new FileInputStream("src/employees.dat"));

            Employee[] recoveredStaff = (Employee[]) readingFile.readObject();

            readingFile.close();

            for (Employee e : recoveredStaff) {
                System.out.println(e);
            }

        }catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }


    }
}

class Employee implements Serializable {

    private String name;
    private double salary;
    private Date contractDate;


    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        contractDate = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return "Employee[name=" + name + ", salary=" + salary + ", contractDate=" + contractDate + "]";
    }
}

class Administrator extends Employee {

    private double bonus;

    public Administrator(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
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
        return "Administrator[name=" + getName() + ", salary=" + getSalary() + ", contractDate=" + getContractDate() + ", bonus=" + bonus + "]";
    }
}