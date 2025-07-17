import java.util.ArrayList;
import java.util.Iterator;

public class UseEmployee {
    public static void main(String[] args) {

//        Employee[] listEmployees = new Employee[3];
//
//        listEmployees[0] = new Employee("Alice", 30, 50000);
//        listEmployees[1] = new Employee("Bob", 25, 60000);
//        listEmployees[2] = new Employee("Charlie", 35, 70000);
//


        ArrayList<Employee> listEmployees = new ArrayList<>();

//        listEmployees.ensureCapacity(11); // Ensure capacity for 11 elements

        listEmployees.add(new Employee("Alice", 30, 50000));
        listEmployees.add(new Employee("Bob", 25, 60000));
        listEmployees.add(new Employee("Charlie", 35, 70000));
        listEmployees.add(new Employee("David", 28, 55000));
        listEmployees.add(new Employee("Eve", 32, 65000));
        listEmployees.add(new Employee("Frank", 40, 80000));
        listEmployees.add(new Employee("Grace", 29, 52000));
        listEmployees.add(new Employee("Hank", 33, 72000));
        listEmployees.add(new Employee("Ivy", 27, 58000));
        listEmployees.add(new Employee("Jack", 31, 63000));
        listEmployees.add(new Employee("Kathy", 26, 54000));

//        listEmployees.set(5, new Employee("Frank", 41, 81000)); // Update Frank's salary
//        listEmployees.remove(2); // Remove Charlie from the list
//        System.out.println(listEmployees.get(3).getData()); // Access David's data);

//        listEmployees.trimToSize(); // Trim the size to the current number of elements

//        for (Employee listEmployee : listEmployees) {
//            System.out.println(listEmployee.getData());
//        }

        Iterator<Employee> iterator = listEmployees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getData());
        }


//        for (int i = 0; i < listEmployees.size(); i++) {
//            System.out.println(listEmployees.get(i).getData());
//            }

//         //Convert ArrayList to array
//         Employee [] arrayEmployees = new Employee[listEmployees.size()];
//
//         listEmployees.toArray(arrayEmployees); // Convert ArrayList to array
//
//        for(int i = 0; i < arrayEmployees.length; i++) {
//            System.out.println(arrayEmployees[i].getData());

    }
}

class Employee {

    private final String name;
    private final int age;
    private final double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getData() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }


}