package OOP.src;

import java.util.ArrayList;

public class Buah {
    private String nama;
    private int harga;
    private int stock;

    public static ArrayList<Buah> listBuah = new ArrayList<Buah>();

    public Buah(String nama, int harga, int stock) {
        setNama(nama);
        setHarga(harga);
        setStock(stock);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama.length() == 0) {
            throw new IllegalArgumentException("Nama cannot be below 0");
        }
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga <= 0) {
            throw new IllegalArgumentException("harga cannot be below 0");
        }
        this.harga = harga;
    }

    public int getStock() {
       return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("harga cannot be below 0");
        }
        this.stock = stock;
    }
}