public class CobaLoopingFor{
	public static void main(String arg[]){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++)
				System.out.print('*');

				System.out.println();
		}
	}
}

/*penjelasan code
pada pogram looping ini, yang pertama di eksekusi adalah
for (int j=0; j<i+1; j++)
System.out.print('*'); >>>> jika j=0 maka j akan di tambah satu dan j diincrement kan
setelahnya looping berlanjut 
for (int i=0; i<10; i++)

maka keluaran output akan:
*
**
***
****
*****
******
*******
********
*********
program yang berjalan hanya sampai 9 karena dimulai dari 0 dan batas looping <10 
dimana program akan berhenti jika sudah mencapai 9 
*/