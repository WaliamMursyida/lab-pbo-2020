public class GetArguments {
	public static void main(String args[]) {
		System.out.println("Tanggal : " + args[0]);
		System.out.println("Bulan : " + args[1]);
		System.out.println("Tahun : " + args[2]);
	}
}

/* penjelasan tentang get arguments

Method main memiliki parameter berupa array bertipe String. Berapapun argumen yang diketik saat
running, akan disimpan dalam array tersebut dan diakses dengan menggunakan indeks.

*/