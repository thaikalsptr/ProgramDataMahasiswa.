

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    double nilai;

    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Nilai  : " + nilai);
        cekKelulusan();
        System.out.println("----------------------");
    }

    public void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status : Lulus");
        } else {
            System.out.println("Status : Tidak Lulus");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa[] daftar = new Mahasiswa[3];

        System.out.println("=== PROGRAM DATA MAHASISWA ===");

        for (int i = 0; i < daftar.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Masukkan nama  : ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM   : ");
            String nim = input.nextLine();

            System.out.print("Masukkan nilai : ");
            double nilai = input.nextDouble();
            input.nextLine();

            daftar[i] = new Mahasiswa(nama, nim, nilai);

            System.out.println("\n=== HASIL DATA MAHASISWA ===");
            daftar[i].tampilkanData();
        }

        input.close();
    }
}
