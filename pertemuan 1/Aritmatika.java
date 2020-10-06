public class Aritmatika {

	public static void main(String args[]){
		int a= 10;
		int b= 20;
		int c= 25;
		int d= 25;

		System.out.println("a + b =" + (a + b) );
		System.out.println("a - b =" + (a - b) );
		System.out.println("a * b =" + (a * b) );
		System.out.println("b / a =" + (b / a) );
		System.out.println("b % a =" + (b * a) );
		System.out.println("c * a =" + (c % a) );
		System.out.println("a++ =" + (a++) );
		System.out.println("b-- =" + (a--) );
		System.out.println("d++ =" + (d++) );
		System.out.println("++d =" + (++d) );

	}
}

/*penjelasan tentang code aritmatika diatas:
1. a+b =10+20= 30 (maksudnya nilai a yang telah di deklarasi akan ditambah nilai b yang hasilnya 30)
2. a-b =10-20=-10 (maksudnya nilai a yang telah di deklarasi akan dikurangkan nilai b yang hasilnya -10)
3. a*b =10*20=200 (maksudnya nilai a yang telah di deklarasi akan dikalikan nilai b yang hasilnya 200)
4. b/a =20+10= 2  (maksudnya nilai b yang telah di deklarasi akan dibagi nilai a yang hasilnya 2)
5. a%b =20%10= 0  (maksudnya nilai b yang telah di deklarasi akan dimodulo dengan nilai a yang hasilnya 10.
								   modulo adalah sisa bagi, dikarenakan 20 : 10 habis maka tidak ada sisanya)
6. c*a=25*10=250	(maksudnya nilai c yang telah di deklarasi akan dikalikan nilai a yang hasilnya 250)							   
7. a++ =10++=10 	(proses ini adalah proses increment, proses increment sendiri akan ditambah operan 1 setelah code 
								   di eksekusi namun untuk hasil awalnya akan tetap 10, lalu baru hasil selanjutnya adalah 11. alur ini juga 
								   disebut post-increment)
8. b--=11--=11		(proses ini adalah proses decrement,yang pertama dimana nilai untuk b di ambil nilai variabel a.pada code sebelumnya 
										nilai a telah di post-icrement kan menjadi 11 atau maksdnya nilai nya akan ditambah operan 1)
9. d++ = 25 			(proses ini adalah increment yang akan di postincrement atau d akan menampilkan nilainya terlebih dahulu baru akan ditambahkan 1 nilai 
									sehingga nilainya adal 25)
10.	++d = 27 			(proses ini adalah incremet dalam bentuk pre-increment. sebelumnya variabel d telah mendapat postincrement yang membuat nilai d menjadi 26, dan pada proses ini d kembali 
									mendapat preincrement yaitu variabel d akan langsung mendapat penambahan  1 sehinnga hasil akhirnya adalah 27 )

sumber saya belajar increment dan decrement 
https://www.duniailkom.com/tutorial-belajar-java-jenis-jenis-operator-increment-decrement-bahasa-java/#:~:text=Pengertian%20Increment%20dan%20Decrement%20Bahasa,a%2B%2B%20%2C%20dan%20a%2D%2D%20.&text=Increment%20digunakan%20untuk%20menambah%20variabel,mengurangi%20variabel%20sebanyak%201%20angka.
*/
