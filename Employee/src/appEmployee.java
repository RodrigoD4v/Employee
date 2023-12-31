import java.util.Scanner;
import java.util.Locale;
public class appEmployee {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee(null, 0, 0);

        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: "+ employee);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: "+ employee);
        sc.close();
    }
}
