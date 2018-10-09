/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan37.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author
 * Nama     : Gandy Christian Situmorang
 * Kelas    : PBO-6
 * NIM      : 10116228
 * Deskripsi Program : program ini berisi program menunjukan nilai rata-rata 
 */
public class PBO610116228Latihan37RataRataNilai {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int jmlMhs;
        Scanner scanner = new Scanner(System.in);
        rata2nilai rata2 = new rata2nilai();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jmlMhs = scanner.nextInt();
        
        rata2.hitungNilai(jmlMhs);
        double jmlNilai;
        System.out.println("\n" + "Rata Rata Nilainya adalah : " + 
                rata2.hitungRata2Nilai(rata2.jmlNilai,jmlMhs));
       
    }
    
}
