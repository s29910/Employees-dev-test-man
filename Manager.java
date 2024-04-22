import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Employee {
    public Manager(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
    }

    public ArrayList<Goal> goals = new ArrayList<>();

    public void addGoal(Goal g) {
        goals.add(g);
    }

    @Override
    public int calculateSalary() {
        int totalGoals = 0;
        LocalDate date;
        date = LocalDate.now();
        int month = date.getMonthValue();
        int year = date.getYear();
        int day = date.getDayOfMonth();
        for (Goal g : goals) {
            if (month <= g.month || year <= g.year || day <= g.day) {
                totalGoals += g.bonusOfTheGoal;
            }
        }
        return super.calculateSalary() + totalGoals;
    }
}



