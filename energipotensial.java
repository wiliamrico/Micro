import java.util.Scanner;

public class energipotensial {

public static void main(String[] args) {
	
   double massa,gravitasi,tinggi,Epotensial;

   Scanner scan = new Scanner(System.in);
   System.out.println("MENCARI BESAR ENERGI POTENSIAL ");
   System.out.print("MASUKAN MASSA: ");
   massa = scan.nextDouble();
   System.out.print("MASUKAN GRAVITASI: ");
   gravitasi = scan.nextDouble();
   System.out.print("MASUKAN KETINGGIAN: ");
   tinggi = scan.nextDouble();
  
   Epotensial = (massa*gravitasi*tinggi);
   System.out.println("ENERGI POTENSIAL = " + Epotensial);
    }
}