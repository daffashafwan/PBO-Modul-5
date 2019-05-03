package pbo.modul.pkg5;

import java.util.Scanner;

public class KelolaBuku {

    String type_buku, judul_buku;
    int jumlah_halaman;
    String[] infobuku = new String[2];

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

    public void buku() {

        for (int i = 0; i >= 0; i++) {
            try {
                infobuku[i] = null;
                System.out.print("Masukkan tipe buku : ");
                Scanner input = new Scanner(System.in);
                this.setType_buku(input.nextLine());
                if (this.type_buku.matches("^[a-zA-Z]*$")) ; else {
                    throw new java.util.InputMismatchException() ;
                }
                System.out.print("Masukkan judul buku : ");
                this.setJudul_buku(input.nextLine());
                System.out.print("Masukkan jumlah halaman : ");
                this.setJumlah_halaman(input.nextInt());
                if(this.jumlah_halaman>=1000)
                {
                    throw new java.util.InputMismatchException() ;
                }else;

                infobuku[i] = "\nJudul buku : " + this.getJudul_buku() + "\nTipe buku: " + this.getType_buku() + "\nJumlah halaman buku : " + this.getJumlah_halaman() + "\n";

                System.out.print("Ingin menambah? (0/terserah, harus angka) : ");
                int loop = input.nextInt();

                if (loop == 0) {
                    System.out.println("OK");
                    break;
                } else ;

            } catch (java.util.InputMismatchException e) {
                System.out.println("Maaf data yang anda inputkan tidak benar");
                break;
            } catch (ArrayIndexOutOfBoundsException d) {
                System.out.println("Array Kebanyakan");
                break;
            } finally {
                System.out.println("Next");
            }
        }
        for (int i = 0; i < infobuku.length; i++) {
            System.out.println("Data Buku " + (i + 1));
            if (infobuku[i] != null) {
                System.out.println(infobuku[i]);
            } else {
                System.out.println("Belum terisi");
            }

        }
        /*for (String infobuku1 : infobuku) {
            System.out.println(infobuku1);
        }*/
    }

    /*outerloop:
            for (int loop = 0; loop >= 0; loop++) {
                for (i = 0; i < infobuku.length; i++) {
                    for (j = 0; j < infobuku[i].length; j++) {
                        switch (j) {
                            case 0:
                                System.out.print("Masukkan nama buku : ");
                                this.setType_buku(inputan.next()); 
                                break;
                            case 1:
                                System.out.print("Masukkan Jenis Buku : ");
                                infobuku[i][j] = inputan.next();
                                break;
                            default:
                                System.out.print("Masukkan Jumlah Halaman : ");
                                int halaman = inputan.nextInt();
                                infobuku[i][j] = Integer.toString(halaman);
                                break;
                        }
                    }
                    System.out.print("\nIngin Melanjutkan : ");
                    int lanjut = inputan.nextInt();
                    if (lanjut == 0) {
                        break outerloop;
                    } else;

                }*/
 /*for (i = 0; i < infobuku.length; i++) {
                for (j = 0; j < infobuku[i].length; j++) {
                    switch (j) {
                        case 0:
                            System.out.println("Nama Buku : " + infobuku[i][j]);
                            break;
                        case 1:
                            System.out.println("Jenis Buku : " + infobuku[i][j]);
                            break;
                        default:
                            System.out.println("Jumlah Halaman :  " + infobuku[i][j]);
                            break;
                    }

                }
                System.out.print("\n");
            }*/
}


/*void input() {
        for (i = 0; i >= 0; i++) {
            System.out.print("Masukkan nama buku : ");
            String namabuku = inputan.nextLine();
            this.setJudul_buku(namabuku.split(""));
            
            System.out.print("Masukkan jenis buku : ");
            String jenisbuku = inputan.next();
            this.setType_buku(jenisbuku.split(" "));
            
            System.out.print("Masukkan jumlah halaman : ");
            int halaman = inputan.nextInt();
            this.setJumlah_halaman(halaman);

            String judul = Arrays.toString(this.getJudul_buku());
            String jenis = Arrays.toString(this.getType_buku());
            judul = judul.substring(1, judul.length() - 1).replace(", ", "");
            jenis = jenis.substring(1, jenis.length() - 1).replace(", ", "");
            deret.add("\nJudul Buku : " + judul + "\nJenis Buku : " + jenis + "\nJumlah Halaman : " + this.getJumlah_halaman());
            System.out.print("Mau input lagi : ");
            int ulang = inputan.nextInt();
            if (ulang == 0) {
                break;
            } else;

        }
        for (i = 0; i < deret.size(); i++) {
            System.out.println(deret.get(i));
        }
    }*/
