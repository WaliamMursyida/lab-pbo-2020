public class CopyArray {
	public static void main(String []args){
		int [] array1 ={7,4,8,1,4,1,4};
		int [] array2 =new int[3];

		System.arraycopy(array1,0,array2,0,3);
		
		System.out.print("Array1 : ");
		for (int i=0; i<array1.length; i++)
			System.out.print(array1 [i]+" ");
		System.out.println();

		System.out.print("Array2 : ");
		for(int i=0; i<array2.length; i++)
			System.out.print(array2[i]+" ");
	}
}

/*penjelsan code tentang coppy array atau menyalin array 

pada code diatas terdapat dua array yaitu array1 dan array2


System.arraycopy(array1,0,array2,0,3); >>> pada code ini adalah proses coppy array1 yang dimulai dari indeks 0 dengan array2 yang juga dimulai dari indeks 0 hingga 3
System.out.print("Array1 : "); >>>>> proses array yang sudah disalin di cetak 
		array1[0] ke array2[0]
		array1[1] ke array2[1]
		array2[2] ke array2[2]

System.out.print("Array1 : ");>>>>> menampilkan nilai dari Array1 
	for (int i=0; i<array1.length; i++) >>>> looping dilakukan selama i kurang dari panjang array 1 dan i akan diincrement kan 
	System.out.print(array1 [i]+" "); >>>>>> untuk menampilkan nilai dari array1 sesuai i kemudian sesudahnya ditambahkan spasi 
		System.out.println(); >>>>>>> memindahkan output selanjutnya ke baris baru
 
	System.out.print("Array2 : ");>>>>  menampilkan nilai dari Array2 
	for(int i=0; i<array2.length; i++) >>>>> looping dialkukan selama i kurang dari panjang array 2 dan i akan diincrement kan
	System.out.print(array2[i]+" "); >>>> menampilkan nilai dari array2 sesuai  dengan i kemudian sesudahnya ditambahkan spasi 
*/