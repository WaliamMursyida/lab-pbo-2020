import java.util.Scanner;

public class Ifconditional {
	public static void main(String [] args){

int age=0;
Scanner sc = new Scanner(System.in);

System.out.println("Masukkan umur anda: ");
age = sc.nextInt();

if(age>17)
	System.out.print("Anda sudah boleh buat KTP");
	}
}
	
/*penjelasan code
didalam kode digunakan import scanner untuk membaca nilai yang diinput
disini user diminta untuk menginput umur dalam bentuk integer

disini juga terdapat kondisi dimana "jika umur lebih besar 17" maka programmnya 
disuruh print "anda sudah dapat membuat KTP"

*/