public class SwitchExample{
	public static void main(String[]args){
		int number=20;
		switch(number){
			case 10: System.out.println("10");break;
			case 20: System.out.println("20");break;
			case 30: System.out.println("30");break;
			default: System.out.println("not in 10, 20 or 30");
		}
	}
}

/*switch case juga sama seperti if dan if else if namun beda nya jika switch case memiliki case nya sendiri

int number=20; >>>>> di program telah dideklarasi variabel number adalah 10
case 10: System.out.println("10");break;
case 20: System.out.println("20");break;
case 30: System.out.println("30");break;

dan diatas terdapat 3 case nya. dimana jika number berada disalah satu case tersebut maka akan di print nilainya.
karena disini terdapat number= 20 , maka number berasda di case 20. dan program akan mengeprint 20
*/