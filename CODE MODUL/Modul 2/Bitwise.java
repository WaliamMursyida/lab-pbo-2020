public class Bitwise{

	public static void main(String args[]){
		int a=60;
		int b=13;
		int c=0;

		c= a & b;
		System.out.println("a & b =" +c);

		c = a | b;
		System.out.println("a | b =" +c);

		c = a ^ b;
		System.out.println("a ^ b =" +c);

		c = ~a;
		System.out.println(" ~a =" +c);

		c = a >> 2;
		System.out.println("a >> 2 =" +c);

		c = a << 2;
		System.out.println("a << b =" +c);

		c = a >>> 2;
		System.out.println("a >>> 2 =" +c);
	} 
}

/* penjelasan program Bitwise
 angka biner untuk 60 = 0011 1100
 angka biner untuk 13 = 0000 1101

 maka:
 c = a & b = 12
 caranya:
 a= 0011 1100
 b= 0000 1101
 --------------
 c= 0000 1101 =12 >>> dimana disini menggunakan operasi AND maka nilai akan true jika keduanya sama sama true

 c= a | b
 a= 0011 1100
 b= 0000 1101
 -------------
 c= 0011 1100 =60 >>> dimana disini menggunakan operasi OR maka nilai nya akan true jika salah satunya saja yang true

 c= a ^ b
 a= 0011 1100
 b= 0000 1101
 -------------
 c= 0011 0001 =49 >>> dimana disini menggunakan operasi XOR nilai akan benar jika salah satu yang benar. namun jika keduanya 1 atau salah 0 maka nilai tetap dihitung false 

 c= ~a
 a= 0011 1100
 -------------
 ~a = - 1100 0011
 ---------------
 ~a = - 0011 1100 - (-1)  
------------------------
~a = -60 -(-1) = 61 >>> bitwise compiment ini secara singkat dapat dicari denga rumus (-a)-1= (-60)-1= -61)


c = a << 2 
a = 0011 1100
--------------
a = 1111 0000 = 240 >>> maksudnya adalah dengan melakukan operasi bitwise SHIFT LEFT pada angka biner dari 60 sehingga menghasilkan angka biner nya 240
	
c = a >> 2 
a= 0011 1100
------------
a= 0000 1111 = 15 >>> maksudnya adalah dengan melakukan operasi bitwise SHIFT RIGHT pada angka biner dari 60 sehingga menghasilkan angka biner 15

c = a >>> 2 
a= 0011 1100
------------
a= 0000 1111 = 15 >>> maksudnya adalah dengan melakukan operasi bitwise SHIFT RIGHT pada angka biner dari 60 sehingga menghasilkan angka biner 15
*/