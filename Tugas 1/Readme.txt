NPM :1908107010015
NAMA: WALIAM MURSYIDA

1. Deskripsi program 
pada program ini kita disuruh membuat sebuah program sederhana untuk mengelola penumpang di bus Trans Koetaradja.
selanjutnya, pada program ini terdapat 3 class diagram untuk mempermudah kita saat membuatnya. 
berikut class-diagramnya :

a. penumpang
pada class penumpang terdapat 3 atribut dengan tipe datanya masing-masing, yaitu: nama,umur dan hamil
lalu pada class penumpang terdapat 2 method yaitu: constactor dan acessor.
pada code disini method constractor sendiri meberi nilai awal untuk setiap atributnya
public Penumpang(String nama, int umur, boolean hamil){
		this.nama=nama;
		this.umur=umur;
		this.hamil=hamil;
	}
sedangkan untuk setiap method acessor mengembalikan nilai

	public String getNama(){
		return this.nama;
	}

	 public int getUmur(){
	 	return this.umur;
	 }

	 public boolean getHamil(){
	 	return this.hamil;
	 }

b. Bus 
pada Class Bus terdapat atribut penumpang biasa dan prioritas
terdapat array list untuk setiap penumpang, baik penumpang biasa maupun penumpang priotas dan disini terdapat array list untuk semua jumlah penumpang
Attribute penumpangBiasa berisi penumpang biasa (minimal 0, maksimal 4)
Attribute penumpangPrioritas berisi penumpang prioritas (minimal 0, maksimal 2)

pada class Bus , terdapat method constractor dan acessor.
- method getPenumpangBiasa dan get penumpangPrioritas sendiri berfungsi mengembalikan nilai untuk setiap atribut.
- method getJumlahpenumpangBiasa dan getJumlahPenumpangPrioritas berfungsi untuk menjumlahkan jumlah penumpang unutk setiap kategorinya
- method getjumlahSemua penumpang berfungsi untuk menjulahkan semua jumlah penumpang diatas yaitu penumpang biasa dan prioritas
- method naikPenumpang berfungsi untuk mencatat penumpang yang naik bus.
	pada method ini terdapat kondisi jika penumpangPrioritas kurang dari ukuran priotitas[2] dan berumur kurang dari 15 dan lebih besar 50 dan hamil maka penumpang masuk kategori Prioritas
	nah jika penumpangBiasa dalam kondisi kurang dari biasa [4] maka penumpang biasa
	
	jika penumpang sudah melewati batas prioritas[2]dan biasa[4] maka akan keluar tidak ada kursi kosong dan penumpang gagal dinaikkan/atau ditambah

- method turunPenumpang untuk menurunkan penumpang
- method toString digunakan untuk merepresentasikan sebuah objek, kedalam tipe String.
 
 c. Main
pada kelas main adalah implementasi dari kelas penumpang dan bus
disini terdapat menu dan pilihan untuk menunya sendiri

pada class main juga terdapat method constractor yaitu public Main() 
dan terdapat method main nya sendiri
public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().jalan();
    }

2. Cara jalan program
-  program dijalankan "javac Main.java" dan "java Main" 
- selanjutnya akan keluar menu dari Bus dan terdapat pilihannya
- program akan terunning sesuai dengan code nya.
-
 