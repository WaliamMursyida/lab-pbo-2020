public class CariPanjangElemen{
	public static void main(String args[]){
		int x[][][][] =new int[2][][][];

		x[0]=new int [1][][];
		x[0][0]= new int [2][];
		x[0][0][0]=new int [3];
		x[0][0][1]=new int [2];
		x[1]= new int [2][][];
		x[1][0]=new int [1][];
		x[1][0][0]=new int[2];
		x[1][1]=new int[2][];
		x[1][1][0]=new int[1];
		x[1][1][1]=new int[3];

		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[0][0].length);
		System.out.println(x[0][0][0].length);
		System.out.println(x[0][0][1].length);
		System.out.println(x[1].length);
		System.out.println(x[1][0].length);
		System.out.println(x[1][0][0].length);
		System.out.println(x[1][1].length);
		System.out.println(x[1][1][0].length);
		System.out.println(x[1][1][1].length);
	}
}
/* penjelasan code panjang elemen array

		System.out.println(x.length);  >>>>>>output ini akan menghasilkan 2 karena untuk variabel x elemen yang akan terisi adalah 2
		System.out.println(x[0].length); >>>>>output ini akan menghasilkan 1 karena untuk variabel x[0] elemen yang akan terisi adalah 1
		System.out.println(x[0][0].length); >>>>>output ini akan menghasilkan 2 karena untuk variabel x[0][0] elemen yang akan terisi adalah 2
		System.out.println(x[0][0][0].length);>>>>>output ini akan menghasilkan 3 karena untuk variabel x[0][0][0] elemen yang akan terisi adalah 3
		System.out.println(x[0][0][1].length); >>>>output ini akan menghasilkan 2 karena untuk variabel x[0][0][1] elemen yang akan terisi adalah 2
		System.out.println(x[1].length); >>>>>output ini akan menghasilkan 2 karena untuk variabel x[1] elemen yang akan terisi adalah 2
		System.out.println(x[1][0].length); >>>>> output ini akan menghasilkan 1 karena untuk variabel x[1][0] elemen yang akan terisi adalah 1
		System.out.println(x[1][0][0].length); >>>>>output ini akan menghasilkan 2 karena untuk variabel x[1][0][0] elemen yang akan terisi adalah 2
		System.out.println(x[1][1].length); >>>>> output ini akan menghasilkan 2 karena untuk variabel x[1][1] elemen yang akan terisi adalah 2
		System.out.println(x[1][1][0].length); >>>>> output ini akan menghasilkan 1 karena untuk variabel x[1][1][0] elemen yang akan terisi adalah 1
		System.out.println(x[1][1][1].length); >>>>> output ini akan menghasilkan 3 karena untuk variabel x[1][1][1] elemen yang akan terisi adalah 3

*/