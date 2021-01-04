public class CobaLoopingWhile {
	public static void main(String arg[]){
		int i=0;

		while (i<10){
			int j=0;
			while (j<i+1){
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;	
		}
	}
}
/* penjelasan code
Pernyataan pada while akan dikerjakan setelah pengecekan kondisi pada while bernilai true. 
dimana nilai variabel i =0

while (i<10){ >>>>>> perulangan untuk i kurang dari 10
			int j=0; >>>> lalu kita punya satu variabel lagi j=0
			while (j<i+1){ >>>>> perulangan yang dilakuakn dimana kondisi j < i dan akan di tambah satu kesamping
				System.out.print('*'); >>>> jika nilai looping masih true maka akan di print simbol *
				j++;
			}
			System.out.println();
			i++;	//increment

Output Pada Program diatas sama Dengan program LoopingFor yaitu
	*
	**
	***
	****
	*****
	******
	*******
	********
	*********
	**********  
	*/