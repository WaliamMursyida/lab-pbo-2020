public class Assignment {

	public static void main(String args[]){
		int a= 10;
		int b= 20;
		int c=0;

		c = a+b;
		System.out.println("c =a + b = " +c);

		c += a;
		System.out.println("c += a = " +c);

		c -= a ;
		System.out.println("c -= a = " + c);

		c *= a;
		System.out.println("c *= a = " +c);

		a = 10;
		c = 15;
		c /= a;
		System.out.println("c /= a = " +c);

		a = 10;
		c = 15;
		c %= a;
		System.out.println("c %= a = " +c);

		c<<= 2;
		System.out.println("c <<= 2 =" +c);

		c>>= 2;
		System.out.println("c >>= 2 =" +c);
		
		c &= a;
		System.out.println("c &= a =" +c);

		c ^= a;
		System.out.println("c ^= a =" +c);

		c |= 2;
		System.out.println("c |= a =" +c);

	}
}

/* penjelasan program 
 c= a + b = 10 + 20 =30 (maksud nya nilai variabel a ditambah b akan menjadi nilai c atau disimpan menjadi nilai c)
 c += a >>> c = c + a = 30 + 10 = 40 (karena nilai c yang awal nya disimpan adalah 30 maka nilai 30 akan ditambahkan dengan variabel a hasilnya adalah 40. dan skrg nilai c adalah 40)
 c -= a >>> c = c - a = 40 - 10 = 30 (nilai c yang sudah disimpan tadi (40) dikurangkan dengan 10 maka hasilnya adalah 30)
 */