public class Relasional{

	public static void main(String args[]){
		int a = 10;
		int b = 20;

		System.out.println("a == b =" + (a == b) );
		System.out.println("a != b =" + (a != b) );
		System.out.println("a > b =" + (a > b) );
		System.out.println("a < b =" + (a < b) );
		System.out.println("b >= a =" + (b >= a) );
		System.out.println("b <= a =" + (b <= a) );
	}
}

/*penjelasan kode relational:
kode ini merupakan nilai relasional perbandingan yang akan ditentukan oleh nilai boolean
pertama untuk nilai variabel a dan b telah di deklarasi

jadi outputnya:
a == b >>> maksudnya adalah apakah nilai a sama dengan nila b ? jawaban tentu false
			dimana nilai a=10 dan b=20

a != b >>> maksudnya adalah apakah nilai a tidak sama dengan nila b ? jawaban nya true
			dimana nila a memang berbeda dengan nilai b

a > b >>> maksudnya adalah apakah nilai a lebi besar dari b ? jawabannya false
			karena nilai a=10 dan b =20. 

a < b >>> maksudnya adalah apakah nilai a lebih kecil dari nilai b? jawabannya true
			nilai a=10 nilai b= 20 maka benar nilai a lebih kecil dari nilai b
b >= a >>> maksudnya adalah apakah nila b lebih kecil sama dengan a ? jawabannya false

b <= a >>> maksdudnya adalah apakah nilai b lebih kecil sama dengan a? jawabannya false
*/