import java.util.ArrayList;

public class Developer extends Employee {
    public Developer(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
    }

    public ArrayList<Technology> technologies = new ArrayList<>();

    public void addTechnology(Technology t) {
        technologies.add(t);
    }

    @Override
    public int calculateSalary() {
        int totalbonus = 0;
        //for (int i=0; i<technologies.size();i++)
        for (Technology t : technologies) {
            totalbonus += t.bonus;
        }
        return super.calculateSalary() + totalbonus;
    }
}
