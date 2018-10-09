/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan37.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author Gandy Christian Situmorang
 */
public class rata2nilai {
    double rataRata;
    double jmlNilai = 0;
    
    public void hitungNilai(int jmlMhs){
        int i;
        double nilai;
        Scanner scanner = new Scanner(System.in);
        
        for (i = 1; i <= jmlMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scanner.nextDouble();
            jmlNilai = jmlNilai + nilai;
        }
    }
    
    public double hitungRata2Nilai(double jmlNilai, int jmlMhs) {
        rataRata = jmlNilai / jmlMhs;
        return rataRata;
    }
}
