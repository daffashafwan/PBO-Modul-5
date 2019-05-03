/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.modul.pkg5;

import java.util.Scanner;

public class LUL {

    private String type_buku, judul_buku;
    private int jumlah_halaman;
    static String[] infobuku = new String[2];

    public String getType_buku() {
        return type_buku;
    }

    public void setType_buku(String type_buku) {
        this.type_buku = type_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public static void spesifikasi() {
        String userintip, userinjud;
        int userinhal, loop;

        for (int i = 0; i >= 0; i++) {
            try {
                System.out.print("Masukkan tipe buku : ");
                Scanner input = new Scanner(System.in);
                userintip = input.nextLine();
                System.out.print("Masukkan judul buku : ");
                userinjud = input.nextLine();
                System.out.print("Masukkan jumlah halaman : ");
                userinhal = input.nextInt();

                KelolaBuku datain = new KelolaBuku();

                datain.setType_buku(userintip);
                datain.setJudul_buku(userinjud);
                datain.setJumlah_halaman(userinhal);
                infobuku[i] = "\nJudul buku : " + datain.getJudul_buku() + "\nTipe buku: " + datain.getType_buku() + "\nJumlah halaman buku : " + datain.getJumlah_halaman() + "\n";
                //System.out.println(infobuku[i]);

                System.out.print("Ingin mengulang? (1/0) : ");
                loop = input.nextInt();

                if (loop == 0) {
                    System.out.println("OK");
                    break;
                } else ;

            } catch (java.util.InputMismatchException e) {
                System.out.println("Maaf data yang anda inputkan tidak benar");

            } catch (ArrayIndexOutOfBoundsException d) {
                System.out.println("Array Kebanyakan");
                break;
            } finally {
                System.out.println("Next");
            }
        }
        for(int i = 0;i<infobuku.length;i++)
        {
            System.out.println(infobuku[i]);
        }
        /*for (String infobuku1 : infobuku) {
            System.out.println(infobuku1);
        }*/
    }
}
