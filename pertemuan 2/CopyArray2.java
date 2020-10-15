public class CopyArray2{
	public static void main (String args[]){
		String str1= "Pemrograman";
		String str2= "Java";
		String str3= "PemrogramanJava";
		String str4= "Universitas Syiah Kuala";
		String str5= "universitas syiah kuala";

		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		System.out.println("String 3: "+str3);
		System.out.println("String 1= String 3 ==>" +str1.equals(str3));
		System.out.println("String 2 = String 3 ==>"+str2.equals(str3));
		System.out.println("String 1 + String 2 = String 3 ==>"+(str1+str2).equals(str3));

		System.out.println("\nString 4:"+str4);
		System.out.println("String 5:"+str5);
		System.out.println("Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil");
		System.out.println("String 4 = String 5 ==> "+str4.equalsIgnoreCase(str5));
		System.out.println("String 4 + String 5 = String 5 + String 4 ==> "+(str4+str5).equalsIgnoreCase(str5+str4));

	}
}
/*menjelaskan tentang menyalin array 

pada code diatas terdapat 5 string yang sudah dideklarasi stringnya:
String str1= "Pemrograman";
String str2= "Java";
String str3= "PemrogramanJava";
String str4= "Universitas Syiah Kuala";
String str5= "universitas syiah kuala";

pada baris ke sembilan string 1 akan menghasilkan output "Pemrograman"
pada baris ke sepuluh string 2 akan menghasilkan output "Java"
pada baris ke sebelas string 3 akan menghasilkan output "Pemrograman Java"
pada baris ke duabelas terdapat equals dimana Dengan fungsi ini, maka objek string yang bersangkutan akan dibandingkan dengan objek string
s, pada parameter fungsi ini, dengan membedakan antara huruf besar dengan huruf kecil. sehingga akan menghasilkan output false karena str 1 tidak sama dengan str 3
pada baris ke tiga belas sama halnya dengan baris kedua belas dan outputnya adalah false
namun pada baris ke empat belas equalsnya adalah true dimana str 3 adalah hasil gabungan antara str1 dan 2

pada baris ke 16 outputnya Universitas Syiah Kuala
pada baris ke 17 outputnya universitas syiah kuala
pada baris ke 18 akan menghasilkan output Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil
pada varis ke 19 akan dihasilkan output true karena terdapat equalignore yang dimana pembeda huruf besar dan kecil diabaikan
pada baris ke 20 juga akan menghasilakn output true karena terdapat equalignore dimana akan diabaikan huruf besar dan huruf kecil
*/
