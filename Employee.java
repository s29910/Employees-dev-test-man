import java.time.LocalDate;
import java.time.Year;

public class Employee {
    //protected String name;
    public String name;
    public String surname;
    public String address;
    public String email;
    public String PESEL;
    public int yearOfEmployment;

    public Employee(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateSalary() {
        LocalDate date;
        date = LocalDate.now();
        int year = date.getYear();
        int salary = 0;
        salary = 3000 + ((year - yearOfEmployment) * 1000);

        //method for calculating the salary
        return salary;
    }
}