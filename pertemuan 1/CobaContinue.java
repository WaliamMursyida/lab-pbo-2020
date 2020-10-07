public class CobaContinue{
	public static void main(String [] args){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++){
			    if(j==5)
                continue;
                
			    System.out.print('*');
			}
			System.out.println();
		}
    }
}
/*penjelasan code 
int i=0, i<10 akan melakukan perulangan sebanyak 10 kali (0-9) kebawah pada setiap barisnya akan terdapat 1 "*", dan i++ akan incremet selama masih memenuhi syrat

for (int i=0; i<10; i++) >>>kemudian int j akan melakukan perulangan kesamping sebanyak j<i+1 dimana "*" pada setiap baris akan bertambah 1 
if(j==5) >>>>>terdapat terdapat seleksi If dan Continue yaitu apabila j telah sama dengan 5 maka perulangan j akan dilanjutkan atau continue ke tahapan selanjutnya pada perulangan.

berbeda dengan break tadi. jika break akan berhenti maka continue akan melanjutkan. sehingga terdapay output seperti:
		*
		**
		***
		****
		*****
		*****
		******
		*******
		********
		*********

*/