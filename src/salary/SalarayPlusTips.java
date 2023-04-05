package salary;

public class SalarayPlusTips extends Salary{

    private double tips;

    public SalarayPlusTips(double salary, double tips) {
        super(salary);
        this.tips = tips;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+tips;
    }
}
