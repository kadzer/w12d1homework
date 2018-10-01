package Staff;

public abstract class Employee {
    protected String name;
    private String ninumber;
    protected double salary;

    public Employee(String name, String ninumber, double salary) {
        this.name = name;
        this.ninumber = ninumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
        {this.name = name;}
    else {
            System.out.println("Name can't be blank");
        }
    }

    public String getNinumber() {
        return ninumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        this.salary = this.salary * Math.abs(raise);
    }
    public double payBonus(){
        return this.salary * 0.01;
    }
}
