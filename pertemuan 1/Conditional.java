public class Conditional{
	public static void main(String args[]){
		int a, b;
		a =10;

		b =(a == 1) ? 20 : 30;
		System.out.println("Value of b is : " +b);

		b =(a == 10) ? 20 : 30;
		System.out.println("Value of b is : " +b);
	}
}

/*
Operator ini digunakan untuk mengecek ekspresi boolean, jika true maka yang dipilih sebelah kiri, jika false maka yang dipilih yang sebelah kanan.

dimana b =(a == 1) ? 20 : 30;
kondisi disini, nilai a FALSE karena niali a bukan 1 melainkan 10, sehingga output yang dihasilkan adalah nilai yang sebelah kiri yaitu 30
Pada b = (a == 10) ? 20: 30; 
kondisi disini, nilai a TRUE karena nilai a memang 10, sehingga output yang dihasilkan adalah nilai yang sebelah kiri yaitu 20
*/