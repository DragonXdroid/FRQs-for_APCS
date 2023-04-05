package salary;

public class W2Salary extends Salary {

    private double taxPercentage;
    private double tax;

    private double medicarePercentage;
    private double medicare;

    public W2Salary(double medicare, double taxPercentage, double salary) {
        super(salary);
        this.medicarePercentage = medicare;
        this.taxPercentage = taxPercentage;
    }

    @Override
    public double getSalary() {
        this.medicare = (super.getSalary()* medicarePercentage);
        this.tax = (super.getSalary()* taxPercentage);
        return super.getSalary() - tax - medicare;
    }

}


