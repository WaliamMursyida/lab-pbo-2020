public class LoopingDoWhile{
	public static void main(String arg[]){
		int i=0;
        do{
            int j=0;
			while (j<i+1){
			    System.out.print('*');
			    j++;
			}
			System.out.println();
			i++;

        } while (i<10);
	}
}

/*penjelasan code
pada program diatas dimana program disuruh lakukan perulangan
sebelumnya da dklarasi variabel i=0
maka perintah do:
int j=0; .>>> deklarasi variabel j
while (j<i+1){  >>>>> perulangan j < i maka akan ditambah kesamping sebanyak 1
System.out.print('*'); >>> dan akan di print simbol *
j++; >>> nilai j akan terus diincriment sampai syarat j++

setelah looping j dilakukan maka i akan diincrement kan selama <10 (0-9)

dan ahsil outputnya tetap sama seperti looping for, while
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