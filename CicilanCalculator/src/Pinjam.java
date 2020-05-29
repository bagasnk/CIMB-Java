package CicilanCalculator.src;

public class Pinjam {
    private int hargaAwal;
    private int durasiCicilan;
    private double bunga;

    public Pinjam (int hargaAwal,int durasiCicilan,double bunga){
        setHargaAwal(hargaAwal);
        setDurasiCicilan(durasiCicilan);
        setBunga(bunga);
    }

    public int getHargaAwal() {
        return hargaAwal;
    }

    public void setHargaAwal(int hargaAwal) {
        while (true) {
            hargaAwal = (int) Console.readInputNumber("Harga Awal : ");

            if (hargaAwal >= 1_000_000 && hargaAwal <= 100_000_000) {
                break;
            }
            System.out.println("Harga minimal 1.000.000");
        }
        this.hargaAwal = hargaAwal;
    }

    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    public void setDurasiCicilan(int durasiCicilan) {
        while (true) {
            durasiCicilan = (int) Console.readInputNumber("Durasi Cicilan : ");

            if (durasiCicilan >= 1) {
                break;
            }
            System.out.println("Tahun minimal 1");
        }
        this.durasiCicilan = durasiCicilan;
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        while (true) {
            bunga = Console.readInputNumber("bunga : ");

            if (bunga >= 0) {
                break;
            }
            System.out.println("Bunga minimal 0");
        }
        this.bunga = bunga;
    }
}