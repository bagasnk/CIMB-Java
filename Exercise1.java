
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scannerName = new Scanner(System.in);
        System.out.print("Input Nama anda: "); // output
        String inputName = scannerName.nextLine();
        // Umur
        Scanner scannerAge = new Scanner(System.in);
        System.out.print("Input Umur anda: "); // output
        byte inputAge = scannerAge.nextByte();
        // Tempat Tinggal
        Scanner scannerAddress = new Scanner(System.in);
        System.out.print("Input Alamat anda: "); // output
        String inputAddress = scannerAddress.nextLine();
        // Lahir tahun
        Scanner scannerYear = new Scanner(System.in);
        System.out.print("Input Tahun lahir anda: "); // output
        int inputYear = scannerYear.nextInt();

        System.out.println("\nName : " + inputName + "\nberumur : " + inputAge + " tahun" + "\ndomisili : " + inputAddress + "\nTahun lahir : " +inputYear);
    }
}