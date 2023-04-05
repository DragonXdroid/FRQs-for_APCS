package salary;

public class Main {
    public static void main(String[] args) {


        double salary = 1000;
        double medicare = 0.2;
        double tax = 0.15;
        double tips = 100.01;

         Salary[] salaryClasses  = {new Salary(1000), new W2Salary(medicare,tax,salary),new SalarayPlusTips(salary,tips)};

         for (Salary salaryClass: salaryClasses){ //polymorphism
             System.out.println(salaryClass.getSalary());
         }


    }
}
