public class SwitchExample2{
	public static void main(String[]args){
		int number=20;
		switch(number){
			case 10: System.out.println("10");
			case 20: System.out.println("20");
			case 30: System.out.println("30");
			default: System.out.println("not in 10, 20 or 30");
		}
	}
}

/*penjelasan code 

		int number=20;
			case 10: System.out.println("10");break;
			case 20: System.out.println("20");break;
			case 30: System.out.println("30");break;
			default: System.out.println("not in 10, 20 or 30");

			disini terdapat 3 case dan jika break nya dihapus maka program akan terus berjalan. 
			meskipun nilai untu number 20 ada di case 20. 

			*/