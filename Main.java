import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        // Creating and adding developers
        Developer dev1 = new Developer("John", "Doe", "New York", "john@doe.com", "123456789", 2020);
        Technology t1 = new Technology("Java", 800);
        dev1.addTechnology(t1);
        Technology t2 = new Technology("C", 700);
        dev1.addTechnology(t2);
        employees.add(dev1);

        // Creating and adding testers
        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", "987654321", 2021);
        tester.addTestType("UI/UX");
        tester.addTestType("Unit");
        employees.add(tester);

        // Creating and adding a manager
        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal g1 = new Goal("Implementing FB login", 10, 15, 2024, 1000);
        manager.addGoal(g1);
        Goal g2 = new Goal("sleep", 9, 15, 2023, 100);
        manager.addGoal(g2);
        employees.add(manager);

        System.out.println(dev1.calculateSalary());
        System.out.println(tester.calculateSalary());
        System.out.println(manager.calculateSalary());

        // Calculating total amount to be paid
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month:" + totalAmount + " USD");
    }
}
