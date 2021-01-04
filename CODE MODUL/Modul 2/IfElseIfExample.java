public class IfElseIfExample{
	public static void main(String[]args){
		int marks=65;

		if(marks<50){
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60){
			System.out.println("D grade");
		}
		else if(marks>=60 && marks<70){
			System.out.println("C grade");
		}
		else if(marks>=70 && marks<80){
			System.out.println("B grade");
		}
		else if(marks>=80 && marks<90){
			System.out.println("A grade");
		}
		else if(marks>=90 && marks<100){
			System.out.println("A+ grade");
		}
		else{
			System.out.println("Invalid! ");
		}
	}
}
/* penejlasan code 
	int marks=65; >>>>> disini untuk marks nya sudah di deklarasi 65 dalam bentuk integer

		if(marks<50){ >>>>> disini terdapat kondisi jika nila marks adalah lebih kecil dari 50
			System.out.println("fail"); >>>>> maka program di perintahkan untuk mengeprint "FAIL"
		}
		else if(marks>=50 && marks<60){ >>>>> disini terdapat kondisi lain dimana jika nilai si marks lebih besar sama dengan 50 dan lebih kecil 60
			System.out.println("D grade"); >>>>maka program disuruh print nilai D atau D grade
		}
		else if(marks>=60 && marks<70){ >>>>> disini juga terdapat kondisi lain dimana jika nilai si marks lebih besar sama dengan 60 dan lebih kecil 70 
			System.out.println("C grade"); >>>>> maka si program disuruh print C grade 
		}
		else if(marks>=70 && marks<80){ >>>>> disini juga terdapat kondisi lain dimana jika nilai si marks lebih besar sama dengan 70 dan lebih kecil 80 
			System.out.println("B grade"); >>>>> MAKA siprogram disuruh print B grade 
		}
		else if(marks>=80 && marks<90){ >>>>> disini juga terdapat kondisi lain dimana jika nilai si marks lebih besar sama dengan 80 dan lebih kecil 90 
			System.out.println("A grade"); >>>>>> maka si program di suruh print a grade
		}
		else if(marks>=90 && marks<100){ >>>>> disini juga terdapat kondisi lain dimana jika nilai si marks lebih besar sama dengan 90 dan lebih kecil 100 
			System.out.println("A+ grade"); >>>> maka siprogram akan di print A+ grade
		}
		else{
			System.out.println("Invalid! "); >>> terdapat kondisi lain jika nilai marks tidak ada dikisaran kondisi diatas maka di program invalid

			nah disini jelas bahwa nilai marks adalah 65 maka yang akan menjadi output adalah C GRADE
			*/