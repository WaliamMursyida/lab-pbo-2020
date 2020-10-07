public class Smallest{
	public static void main (String []args){
		int a,b;

		Mulai:
		for(a=0; a<2; a++){
		for(b=0; b<3; b++){
		if(b==2)
		break Mulai;
		System.out.println("a=" + a + " ; b=" + b);
			}
		}
	}
}

/*penjelasan code program smallest
	Program diatas merupakan contoh dari Break yang diberikan label yaitu cara untuk menghentikan operasi sesuai dengan looping yang kita inginkan
	
		for(a=0; a<2; a++){ >>>>>looping yang dilakukan
		for(b=0; b<3; b++){ >>>>>> looping yang dilakukan
		if(b==2)
		break Mulai; >>>> bermakna keluar dari loop for ke-1.
	dan hasil output 
	a=0 ; b=0 >>>>Pada Program diatas break akan menghentikan operasi pada statement Mulai
	a=0 ; b=1

*/