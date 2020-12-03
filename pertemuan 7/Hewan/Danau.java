public class Danau{
	private int jumlahKotak;
	private int kotak[][];

	public Danau(){
		this.jumlahKotak=5;
		buatKotak();
	}

	public Danau(int jumKotak){
		this.jumlahKotak=jumKotak;
		buatKota();
	}

	private void buatKota(){
		kotak =new int [jumlahKotak][jumlahKotak];

	}

	public void tambahKotak(int x, int y){
		kotak[x][y]=1;
	}

	public boolean adaKatak(int x,int y){
		if(kotak[x][y]==1)
			return true;

			return false;
	}

	public void hapusKatak(int x,int y){
		kotak [x][y]=0;
	}
}