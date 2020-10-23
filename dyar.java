import java.util.Scanner;
class dyar{

	public static void main(String[]args){

		Scanner scan = new Scanner(System.in);
		System.out.println("how many letter in your name:");
		int d=scan.nextInt();

		char [] dd = new char [d];
		int len = dd.length;


		for(int j=0; j<len; j++){

			System.out.println("enter letter" + (j+1)+" ");
			String enter= scan.next();
			dd[j] = enter.charAt(0);
		}

		System.out.print("your name ");
		for(int j=0; j<len; j++){

			System.out.print(dd[j]);
		}
		System.out.println("");
	}
}