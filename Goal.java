public class Goal {
    public int bonusOfTheGoal;
    public String name;
    public int day;
    public int month;
    public int year;


    public Goal(String name, int day, int month, int year, int bonusForGoal) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.bonusOfTheGoal = bonusForGoal;
    }
}
