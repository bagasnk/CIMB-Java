package OOP.src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Employee orang = new Employee(50_000,100);
        Scanner scanner = new Scanner(System.in);
        
        // orang.overtime = 5;
        // orang.salary = 50_000;
        // orang.payPerHour = 100;

        System.out.print("Input salary: "); // output
        // orang.setSalary(scanner.nextInt());

        // System.out.print("Input overtime: "); // output
        // orang.setOvertime(scanner.nextInt());

        System.out.print("Input payPerHour: "); // output
        // orang.setPayPerHour(scanner.nextInt());


        // System.out.println(orang.salary + (orang.overtime * orang.payPerHour));
        System.out.println(orang.calcuateWage());
    }

    public static int calculateWage(int salary,int overtime,int payPerHour){
        return salary + (overtime*payPerHour);
    }

    public static void testing () {
        System.out.println("Testing 123");
    }
}
