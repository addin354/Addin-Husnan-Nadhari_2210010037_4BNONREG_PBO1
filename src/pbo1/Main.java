
package pbo1;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Santri[] daftarSantri = new Santri[30];
        
        int indeks = 0;
        
        while (true) {
            System.out.println("1. Tambah santri");
            System.out.println("2. Tampilkan santri");
            System.out.println("3. Keluar");
            System.out.print("Pilih nomor di atas : ");
            int pilihanPengguna = scanner.nextInt();
            scanner.nextLine();
            if (pilihanPengguna == 1) {
                if (indeks >= daftarSantri.length) {
                    System.out.println("Daftar santri penuh!");
                    break;
                }
                try {
                    System.out.print("Masukkan nama santri \t: ");
                    String nama = scanner.nextLine();
                    
                    System.out.print("Masukkan ID Santri \t: ");
                    int idSantri = Integer.parseInt(scanner.nextLine());
                    
                       
                    System.out.print("Asal Santri \t: ");
                    String asal = scanner.nextLine();
                    
                    
                    System.out.print("Tahun Lulus  \t: ");
                    int tahunLulus = Integer.parseInt(scanner.nextLine());
                    
                 
                    
                    daftarSantri[indeks] = new Santri(nama, idSantri, asal, tahunLulus);
                    indeks++;
             
                    System.out.println("Santri berhasil ditambahkan!");
                } catch (NumberFormatException e) {
                    System.out.println("Kesalahan masukkan angka : " + e);
                } catch (Exception e) {
                    System.out.println("Kesalahan : " + e);
                }
            } else if (pilihanPengguna == 2) {
                if (daftarSantri[0] != null) {
                    for (Santri santri : daftarSantri) {
                        if (santri != null) {
                            santri.displayinfo();
                        }
                    }
                } else {
                    System.out.println("Belum ada santri yang terdaftar!");
                }
            } else if (pilihanPengguna == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak ditemukan!");
            }
        }
        scanner.close();
    }
    }
    

