//Class Scanner
import java.util.Scanner;
public class Informasitelevisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                //tipe data
		int InputMerek,Jenis,Tahun,menutama=0;
		int menu=1;
                //4 attribut untuk array
		String Merek [] = {"LG", "Samsung", "Sony"};
		String Jns [] = {"CRT", "Plasma", "LCD", "L4ED"};
		String Thn [] = {"2000-2005", "2005-2010", "2010-2012", "2012+"};
                String Komponen [] = {"PSU", "Mainboard", "Flyback", "CRT", "LCD-Panel", "LED-Panel", "PlasmaPanel", "Y-SUS", "Z-SUS", "Speaker", "Casing"}; 
		//menu utama, perulangan While
		while(menu==1) {
		System.out.println("========================Kelompok 7===========================");
                System.out.println("Selamat Datang");
		System.out.println("Program Menampilkan Komponen TV");
		System.out.println("Dibuat oleh Kelompok 7");
		System.out.println("========================Kelompok 7===========================");
		System.out.println("Silahkan Masukkan Data TV anda");
		//Bagian Input Data, 
		System.out.println("Merek :");
		System.out.println("1. LG  2.Samsung  3.Sony");
		System.out.print("Masukkan :");
		InputMerek = input.nextByte();
		System.out.println("========================Kelompok 7===========================");
		System.out.println("Jenis :");
		System.out.println("1.CRT  2.Plasma  3.LCD   4.LED");
		System.out.print("Masukkan :");
		Jenis = input.nextByte();
		System.out.println("========================Kelompok 7===========================");
		System.out.println("Tahun :");
		System.out.println("1. 2000-2005  2.2005-2010  3.2010-2012   4.2012+");
		System.out.print("Masukkan :");
		Tahun = input.nextByte();
		
		System.out.println("========================Kelompok 7===========================");
		System.out.println("Informasi Komponen TV anda :");
		//Merek televisi, array 3 indeks
		if (InputMerek==1) {
			System.out.println("Merek : " +Merek[0]);
		}else if (InputMerek==2) {
			System.out.println("Merek : " +Merek[1]);
		}else if (InputMerek==3) {
			System.out.println("Merek : " +Merek[2]);	
		}else {
			System.out.println("Input Tidak Sesuai");			
		}
		//Jenis televisi, 4 indeks
		if (Jenis==1) {
			System.out.println("Jenis : " +Jns[0]);
		}else if (Jenis==2) {
			System.out.println("Jenis : " +Jns[1]);
		}else if (Jenis==3) {
			System.out.println("Jenis : " +Jns[2]);	
		}else if (Jenis==4) {
			System.out.println("Jenis : " +Jns[3]);			
		}else {
			System.out.println("Input Tidak Sesuai");			
		}
		//Tahun keluaran televisi, 4 indeks
		if (Tahun==1) {
			System.out.println("Tahun : " +Thn[0]);
		}else if (Tahun==2) {
			System.out.println("Tahun : " +Thn[1]);
		}else if (Tahun==3) {
			System.out.println("Tahun : " +Thn[2]);	
		}else if (Tahun==4) {
			System.out.println("Tahun : " +Thn[3]);			
		}else {
			System.out.println("Input Tidak Sesuai");			
		}
		//Tampil Komponen televisi
		if (Jenis==1) {
			System.out.println("Komponen : " +Komponen[0]+ ", " +Komponen[1]+ ", " +Komponen[2]+ ", " +Komponen[3]+ ", " +Komponen[9]+ ", " +Komponen[10]);
		}else if (Jenis==2) {
			System.out.println("Komponen : " +Komponen[0]+ ", " +Komponen[1]+ ", " +Komponen[6]+ ", " +Komponen[7]+ ", " +Komponen[8]+ ", " +Komponen[9]+ ", " +Komponen[10]);
		}else if (Jenis==3) {
			System.out.println("Komponen : " +Komponen[0]+ ", " +Komponen[1]+ ", " +Komponen[4]+ ", " +Komponen[9]+ ", " +Komponen[10]);
		}else if (Jenis==4) {
			System.out.println("Komponen : " +Komponen[0]+ ", " +Komponen[1]+ ", " +Komponen[5]+ ", " +Komponen[9]+ ", " +Komponen[10]);			
		}else {
			System.out.println("Input Tidak Sesuai");			
		}
		System.out.println("========================Kelompok 7===========================");
		System.out.println("Apakah anda ingin mengulangi program ini ? ( Tekan angka 1");
		System.out.print("Masukkan :");
		menu = input.nextByte();
                }
        System.out.println("Terima Kasih menggunakan Program Kami");
	}
}
