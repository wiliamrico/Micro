import java.util.Scanner; 

public class Musim
{
public static void main(String args[])
    {
Scanner input= new Scanner(System.in);
int a;
System.out.print("Masukkan angka =");
a=input.nextInt();
if(a == 1){
System.out.println("Januari Mengalami Musim Dingin ");}
else if(a == 2){
System.out.println("Februari Mengalami Musim Dingin ");}
else if(a == 3){
System.out.println("Maret Mengalami Musim Semi");}
else if(a == 4){
System.out.println("April Mengalami Musim Semi");}
else if(a == 5){
System.out.println("Mei Mengalami Musim Semi");}
else if(a == 6){
System.out.println("Juni Mengalami Musim Panas");}
else if(a == 7){
System.out.println("Juli Mengalami Musim Panas");}
else if(a == 8){
System.out.println("Agustus Mengalami Musim Panas");}
else if(a == 9){
System.out.println("September Mengalami Musim Gugur");}
else if(a == 10){
System.out.println("Oktober Mengalami Musim Gugur");}
else if(a == 11){
System.out.println("November Mengalami Musim Gugur");}
else if(a == 12){
System.out.println("Desember Mengalami Musim Dingin");}
else{
System.out.println("BULAN DAN MUSIM YANG ANDA MASUKKAN TIDAK TERDAFTAR");}
    }
}