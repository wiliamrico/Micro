import java.util.Scanner;
public class Binarysearch{
	public static int[] data = null;
	public static int awal, tengah, akhir, semt, count;
	
        
	//	Sorting Ascending
	public static void sorting()
	{
		for(int x = 0; x < data.length; x++)
		{
			for(int y = 0; y < data.length; y++)
			{
				if(x == y){
					continue;
                                }
				else
				{
					if(data[x] < data[y])
					{
						semt = data[y];
						data[y] = data[x];
						data[x] = semt;
					}
				}
			}
		}
	}

        public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//	Input jumlah data
		System.out.print("Jumlah data : ");		
		int jlh = scan.nextInt();
		
		//	Input tiap nilai dan simpan ke array
		data = new int[jlh];
		for(int x = 0; x < data.length; x++){
			System.out.print("Masukkan Data ke-"+(x+1)+" : ");	
			data[x] = scan.nextInt();
		}
		
		//	Menampilkan data sebelum di sorting
		System.out.print("\nData    : ");
		for(int x = 0; x < data.length; x++)
			System.out.print(data[x]+" ");
		
		//	Proses sorting
		sorting();
		
		//	Menampilkan Data setelah di sorting
		System.out.println();
		System.out.print("Sorting : ");
		for(int x = 0; x < data.length; x++)
			System.out.print(data[x]+" ");
		
		//	Input data yang dicari
		System.out.print("\nData yang dicari : ");		
		int cari = scan.nextInt();
		
		//	Proses Metode Pencarian Binary Searching
		System.out.println();
		boolean temu = false;
		awal = 0;
		akhir = data.length - 1;
		semt = 0;
		count = 0;
		int iterasi = 0;
		System.out.println("Cek  Aw  Ak  Te  Ni");
		while(temu != true){								
			tengah = (awal + akhir) / 2;
			iterasi++;
			//	value == cari
			if(data[tengah] == cari){
				System.out.print(iterasi+"   ");
				System.out.print(awal+"   ");
				System.out.print(akhir+"   ");
				System.out.print(tengah+"   ");
				System.out.print(data[tengah]+"\n");
				temu = true;
					break;
			}
			//	value < cari
			else if(data[tengah] < cari)
			{
				System.out.print(iterasi+"   ");
				System.out.print(awal+"   ");
				System.out.print(akhir+"   ");
				System.out.print(tengah+"   ");
				System.out.print(data[tengah]+"\n");
				awal = tengah + 1;
			}
			//	value > cari
			else if(data[tengah] > cari)
			{
				System.out.print(iterasi+"   ");
				System.out.print(awal+"   ");
				System.out.print(akhir+"   ");
				System.out.print(tengah+"   ");
				System.out.print(data[tengah]+"\n");
				akhir = tengah - 1;
			}
			//	Cek Worst Case
			if(semt != data[tengah])
				semt = data[tengah];
			else
				count++;
                        
			//	batasan untuk worst case
			if(count == 3)
				break;
		}
		//	Output
		if(temu == true)
			System.out.println("\nNilai data "+cari+" ditemukan pada index ke-"+tengah+"\n"+
			"dan Iterasi ke-"+iterasi);
		else
			System.out.println("\nNilai data "+cari+" tidak ditemukan");
	}
}