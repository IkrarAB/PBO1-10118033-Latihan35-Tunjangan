package pbo1.pkg10118033.latihan35;

import java.util.Scanner;

public class Gaji {
    Scanner sc = new Scanner(System.in);
    private double pokok, tunjangan, total;
    private String status;
	
    public void inputAwal(){
	System.out.print("Berapa gaji pokok anda perbulan? : Rp.");
	pokok = sc.nextDouble();
	System.out.print("Status anda? (Menikah/Belum) : ");
	status = sc.next();
    }
	
    public void outputAkhir(){
	hitungTotal();
	System.out.println("=====Hasil Perhitungan Gaji Anda=====");
	System.out.println("Gaji Pokok : Rp."+pokok);
	System.out.println("Tunjangan  : Rp."+tunjangan);
	System.out.println("Total Gaji : Rp."+total);
    }	
    
    private void hitungTunjangan(){
	tunjangan = (status.equalsIgnoreCase("Menikah") ? 0.35*pokok : 0);
    }
	
    private void hitungTotal(){
	hitungTunjangan();
	total = tunjangan+pokok;
    }
}
