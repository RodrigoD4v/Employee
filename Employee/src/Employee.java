public class Employee{
    String name;
    double grossSalary;
    double tax;

    public Employee(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }
    public double NetSalary(){
        return this.grossSalary-tax;
    }
    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage/100;
    }
    public String toString(){
        return name + ", $" + String.format("%.2f", NetSalary());
    }
}