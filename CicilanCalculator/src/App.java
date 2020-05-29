package CicilanCalculator.src;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    static final int BULAN_DALAM_TAHUN = 12;
    static final int PERCENT = 100;

    public static void main(String[] args) throws Exception {
        int hargaAwal;
        int durasiCicilan;
        double bunga;

        hargaAwal = (int) Console.readInputNumber("Harga Awal : ");
        durasiCicilan = (int) Console.readInputNumber("Durasi Cicilan : ");
        bunga = Console.readInputNumber("bunga : ");

        double bayaranPerBulan = Tampil.hitungBayaranPerbulan(hargaAwal, durasiCicilan, bunga);
        Tampil.tampilBayaran(bayaranPerBulan);
        Tampil.hitungSisaBayaranPerBulan(hargaAwal, durasiCicilan, bunga, bayaranPerBulan);
    }
}
