package InheritancePolymorphism.src;

public class PajakCalculatorimpl implements PajakCalculator {
    private double pendapatan;
    public PajakCalculatorimpl(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public double hitungPajak(){
        return pendapatan * 0.2;
    }

    public void testing(){
        System.out.println("TESTING INTERFACE");
    }
}