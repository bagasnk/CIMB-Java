package OOP.src;

public class Employee {
    private int salary;
    private int overtime;
    private int payPerHour;

    public Employee(int salary,int payPerHour){
        setSalary(salary);
        setPayPerHour(payPerHour);
    }

    public void setSalary(int salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary cannot be below 0");
        }
        this.salary = salary;
    };

    public int getSalary() {
        return this.salary;
    }

    private void setOvertime(int overtime) {
        if (overtime < 0) {
            throw new IllegalArgumentException("Overtime cannot be below 0");
        }
        this.overtime = overtime;
    };

    public int getOvertime() {
        return this.overtime;
    }

    public void setPayPerHour(int payPerHour) {
        if (payPerHour <= 0) {
            throw new IllegalArgumentException("payPerHour cannot be below 0");
        }
        this.payPerHour = payPerHour;
    };

    public int getPayPerHour() {
        return this.payPerHour;
    }

    public int calcuateWage(int overtime) {
        setOvertime(overtime);
        return this.salary + (this.overtime * this.payPerHour);
    }

    public int calcuateWage() {
        return this.salary;
    }
}