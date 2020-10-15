public class Array1 {
	public static void main(String args[]){
	int nilai [] = new int[3];
		nilai [0]=70;
		nilai [1]=80;
		nilai [2]=65;
		double ratarata=0.0;

		for (int i=0; i<nilai.length; i++)
			ratarata+=nilai[i];

		ratarata/=nilai.length;
		System.out.println("Nilai rata-rata ="+ratarata);
	}
}
/*penjelasan Array 1 tentang rata-rata

dimana variabel nilai memiliki indeks array [3] dan dimulai dari 0
untuk setiap indeks memiliki nilai sbb:
nilai [0]=70;
nilai [1]=80;
nilai [2]=65;

didalam code ini terdapat looping for untuk mecari rataratanya
for (int i=0; i<nilai.length; i++)
ratarata+=nilai[i]; >>>> disini maksudnya rata-rata= ratarata + nilai[i]= hasil jumlah setiap nilai i = 215

ratarata/=nilai.length;
ratarata= ratarata / nilai.length >>>> nilai length diambil pada panjangnya indeks array yaitu 3 = 215 / 3 =71.66666666666667 >>>>> karena rata rata pada code diatas dideklarasi dalam bentuk double maka hasilnya akan berbentuk double

*/