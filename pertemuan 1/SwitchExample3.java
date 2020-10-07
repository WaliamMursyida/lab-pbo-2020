public class SwitchExample3{
	public static void main (String []args){
		String dayOfWeekArg ="Thursday";
		String typeOfDay = "";

		switch (dayOfWeekArg){
			case "Monday":
				typeOfDay ="Start of work week";
			break;
			case"Tuesday":
			case"Wednesday":
			case"Thursday":
				typeOfDay = "Midweek";
			break;
			case"Friday":
				typeOfDay ="End of work week";
			break;
			case "Saturday":
			case "Sunday":
				typeOfDay="Weekend";
			break;
			default:
				System.out.println("Invalid day of the week: " +dayOfWeekArg);		
		}
	System.out.println(typeOfDay);
	}
}

/* penjelasan code
Program diatas masih merupakan contoh Seleksi Switch Case yang bermakna hanya akan ada satu pernyataan saja yang akan dipilih.
	Pada program diatas terdapat dua variabel bertipe data string yaitu dayOfWeekArg dan typeOfDay yang dimana dayOfWeekArg memiliki nilai atau berisi "thursday"
		case "Monday":
				typeOfDay ="Start of work week"; >>>>> "monday" maka typeOfDay yang akan dijadikan sebagai Output nya adalah " Start of work Week"  
		
		case"Tuesday":
		case"Wednesday":
		case"Thursday": >>>>> maka typeOfDay yang akan dijadikan sebagai Outputnya untuk ketiga case diatas adalah " Mid Week" 
		
		case"Friday":
				typeOfDay ="End of work week"; >>>>> " typeOfDay nya adalah " End of work Week" yang akan dijadikan sebagai Output 
		
		case "Saturday":
		case "Sunday":
		typeOfDay="Weekend"; >>>>> typeOfDay nya adalah " Week End" yang akan dijadikan sebagai Output

	Apabila dayOfWeekArg diluar dari semua Case tersebut maka akan menghasilkan Outputnya adalah "Invalid day of the week"

	Pada program diatas dayOfWeekArg memiliki nilai string "thursday" sehingga typeOfDay yang akan dijadikan sebagai Outputnya adalah " Mid Week" 
	*/