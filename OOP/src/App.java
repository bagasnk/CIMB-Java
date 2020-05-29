package OOP.src;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public static void main(String[] args) throws Exception {
        tampilMenu();
}

    public static void tampilMenu() {
        int pilihMenu;
        System.out.println("TOKO KELONTONG \n1. Tambah Buah\n2. List Buah\n3. Exit");
        do {
            pilihMenu = scanner.nextInt();
            switch (pilihMenu) {
                case 1:
                    Menu.tambahBuah();
                    break;
                case 2:
                    Menu.tampilBuah();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 3.");
            }
        } while (pilihMenu != 3);
    }
}
