import java.util.Scanner;

public class energiPotensial{

	public static void main(String[] args){
	int i;
	
	double m=0; double g=0; double  t=0; double ep=0;

	Scanner input = new Scanner(System.in);

	for(i=1; i<3; i++){

	System.out.print("MASUKAN MASSA: ");
   	m = input.nextDouble();
  	System.out.print("MASUKAN GRAVITASI: ");
   	g = input.nextDouble();
   	System.out.print("MASUKAN KETINGGIAN: ");
   	t = input.nextDouble();

	ep = m*g*t;

	System.out.println("EP : " +ep+ "  Joule");
	System.out.println("");

	}
}
}