// import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // System.out.println("Hello Dunia");

        // umur --> byte
        byte number = 21;

        // short 
        short iniShort = 128;

        // int
        int iniInt = 1142342;

        // long
        long iniLong = 1234512313;

        // float
        float iniFloat = 147.32F;

        // double
        double iniDouble = 142.320D;

        // string
        String nama = "Seto";

        // char
        char grade = 'B';

        // bool
        boolean isVerfied = true;

        // REFERENCE DATA TYPES
        int people[] = new int[5];

        // for(int i = 0; i<people.length;i++){
        //     people[i] = i * 3;
        // }
    
        // System.out.println(Arrays.toString(people));
        
        people[4] = 1;
        int matrix[][]= new int[4][3];
        matrix[0][1] = 17;
        matrix[1][0] = 7;
        // System.out.println(Arrays.deepToString(matrix));

        final float PI = 3.14F;
        // System.out.println(PI);

        //nama,umur,tempatinggal,lahirtahun

        // Nama
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

        System.out.println("Name : " + inputName + "\nberumur : " + inputAge + " tahun" + "\ndomisili : " + inputAddress + "\nTahun lahir : " +inputYear);



    }
}