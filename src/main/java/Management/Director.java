package Management;

public class Director extends Manager{
    private double budget;

    public Director(String name, String ninumber, double salary, String deptName, double budget) {
        super(name, ninumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    public double payBonus() {
        return this.salary * 0.02;
    }

}
