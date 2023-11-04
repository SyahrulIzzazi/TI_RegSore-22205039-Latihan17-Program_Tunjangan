package ti_regsore.pkg22205039.latihan17.program_tunjangan;

/*
NAMA    : Syahrul Izzazi
NIM     : 22205039
PRODI   : TI RegSore
DESKRIPSI : Program menghitung gaji dan tunjangan
*/

import java.util.Scanner;
public class TI_RegSore22205039Latihan17Program_tunjangan {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("=======Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        double gaji = input.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum):");
        String status = input.next();
        
        System.out.println("=========Hasil Perhitungan Gaji Anda===========");
        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
           tunjangan = 0.35*gaji;
        } else { 
            tunjangan = 0;
        }
        double totalgaji = gaji + tunjangan;
        System.out.println("Gaji Pokok: "+gaji);
        System.out.println("Tunjangan: "+tunjangan);
        System.out.println("Total gaji: "+totalgaji);
    }
    
}