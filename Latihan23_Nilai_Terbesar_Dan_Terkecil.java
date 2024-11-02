/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Membuat Program Nilai Terbesar Dan Terkecil
 */
import java.util.Scanner;
public class Latihan23_Nilai_Terbesar_Dan_Terkecil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = scanner.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();

            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }

        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
        System.out.println("\nPetugas : " + namaPetugas);
    }
}
