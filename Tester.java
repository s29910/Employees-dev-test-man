import java.util.ArrayList;

//ctrl + o - for override the methods
public class Tester extends Employee {

    public Tester(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
    }

    public ArrayList<String> TypesOfTest = new ArrayList<>();


    @Override
    public int calculateSalary() {
        return super.calculateSalary() + TypesOfTest.size() * 300;
    }

    public void addTestType(String type) {
        TypesOfTest.add(type);
    }
}
