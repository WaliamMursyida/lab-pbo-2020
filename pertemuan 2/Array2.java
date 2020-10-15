public class Array2 {
	public static void main(String args[]){

int [][] arrx= new int [3][3];
arrx [0][0]=1;
arrx [0][1]=2;
arrx [0][2]=3;
arrx [1][0]=4;
arrx [1][1]=5;
arrx [1][2]=6;
arrx [2][0]=7;
arrx [2][1]=8;
arrx [2][2]=9;

System.out.println("Nilai arrx[0][0] : " + arrx[0][0]);
System.out.println("Nilai arrx[0][1] : " + arrx[0][1]);
System.out.println("Nilai arrx[0][2] : " + arrx[0][2]);
System.out.println("Nilai arrx[1][0] : " + arrx[1][0]);
System.out.println("Nilai arrx[1][1] : " + arrx[1][1]);
System.out.println("Nilai arrx[1][2] : " + arrx[1][2]);
System.out.println("Nilai arrx[2][0] : " + arrx[2][0]);
System.out.println("Nilai arrx[2][1] : " + arrx[2][1]);
System.out.println("Nilai arrx[2][2] : " + arrx[2][2]);
	}
}

/*penjelasan code tentang Array 2 dimensi 

int [][] arrx= new int [3][3];
 >>>> int [3][3] arrx= { [0][1][2]
 						[0][1][2]
 						}

System.out.println("Nilai arrx[0][0] : " + arrx[0][0]); >>>>untuk output ini nilai elemen array indeks [0][0] adalah 1 
System.out.println("Nilai arrx[0][1] : " + arrx[0][1]); >>>>untuk output ini nilai elemen array indeks [0][1] adalah 2
System.out.println("Nilai arrx[0][2] : " + arrx[0][2]); >>>>untuk output ini nilai elemen array indeks [0][2] adalah 3
System.out.println("Nilai arrx[1][0] : " + arrx[1][0]); >>>>untuk output ini nilai elemen array indeks [1][0] adalah 4
System.out.println("Nilai arrx[1][1] : " + arrx[1][1]); >>>>untuk output ini nilai elemen array indeks [1][1] adalah 5
System.out.println("Nilai arrx[1][2] : " + arrx[1][2]); >>>>untuk output ini nilai elemen array indeks [1][2] adalah 6
System.out.println("Nilai arrx[2][0] : " + arrx[2][0]); >>>>untuk output ini nilai elemen array indeks [2][0] adalah 7
System.out.println("Nilai arrx[2][1] : " + arrx[2][1]); >>>>untuk output ini nilai elemen array indeks [2][1] adalah 8
System.out.println("Nilai arrx[2][2] : " + arrx[2][2]); >>>>untuk output ini nilai elemen array indeks [2][2] adalah 9

*/