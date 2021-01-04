public class Logika{

	public static void main(String args[]){
		boolean a = true;
		boolean b = false;

		System.out.println("a && b =" + (a&&b) );
		System.out.println("a || b =" + (a||b) );
		System.out.println("!(a && b)=" + !(a&&b) );
	}
}

/* penjelasan program 
a && b = false >>> karena operator AND akan benar jika keduanya benar, namun karena nilai b adalah false maka outputnya adalah false
a || b = true >>> karena operator OR akan bernilai benar jika salah satu nilainya benar.
!(a && b)= true >>> karena operator adalah operator yang mebalikkan nilai boolean. sebelumya a && b bernilai False maka setelah adanya operator ! nilainya akan menjadi true
*/ 