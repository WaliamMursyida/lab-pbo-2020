public class CopyArray3{
	public static void main(String[]args){
		String str1 = "Informatika Universitas Syiah Kuala";

		System.out.println(str1.startsWith("inf"));
		System.out.println(str1.endsWith("kuala"));
		System.out.println(str1.startsWith("Inf",1));
		System.out.println(str1.startsWith("Inf",2));
		System.out.println(str1.startsWith("Inf",3));
	}
}
/*penjelasan tentang string dimana terdapat starswith dan endswith
1. startsWith(String s)
	Dengan fungsi ini, maka objek String yang bersangkutan akan diperiksa, apakah diawali oleh
	objek String s, pada parameter fungsi ini.
2. endsWith(String s)
	Dengan fungsi ini, maka objek string yang bersangkutan akan diperiksa, apakah diakhiri oleh
	objek string s, pada parameter fungsi ini

	pada baris ke 5 karena string yang bersangkutan "inf" tidak ada diawali oleh objek String s, pada parameter fungsi ini. 
	maka outputnya false
	pada baris ke 6 karena string yang bersangkutan "kuala" diakhiri oleh objek string s, pada parameter fungsi ini. disini kata "kuala" menggunakan huruf k kecil
	maka outputnya false
	pada baris ke 7 untuk membandingkan apakah string pada indeks str[1] diawali dengan "Inf" jawabannya tidak, maka akan menampilkan output false
	pada baris ke 8 untuk membandingkan apakah string pada indeks str[2] diawali dengan "Inf"  jawabannya tidak, maka akan menampilkan output false
	pada baris ke 9 untuk membandingkan apakah string pada indeks str[3] diawali dengan "Inf"  jawabannya tidak, maka akan menampilkan output false
 
*/