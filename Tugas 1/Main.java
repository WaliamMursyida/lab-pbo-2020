<<<<<<< HEAD
import java.util.Scanner;

public class Main {   
    private static Scanner in;
    private boolean berangkat;
    Bus bus = new Bus();   

public Main() {
        this.berangkat = true;
    }

    public void jalan(){     
      
    do{
    	System.out.println("==================================================");
        System.out.println("===== SELAMAT DATANG DI BUS TRANS KOETARADJA =====");
        System.out.println("==================================================\n");
        System.out.println("=========================");
        System.out.println("|\tMENU\t\t|");
        System.out.println("=========================");
        System.out.println("| 1. Naikkan Penumpang  |");
        System.out.println("| 2. Turunkan Penumpang |");
        System.out.println("| 3. Lihat Penumpang\t|");
        System.out.println("| 4. keluar\t\t|");
        System.out.println("=========================");
        System.out.print("Pilihan: ");
        int pilihan = in.nextInt();
        System.out.println(" ");
  
           if (pilihan == 1) {         
                 System.out.print("Masukan nama : ");
                 String nama = in.next(); 
                 System.out.print("Masukan umur : ");
                 int umur = in.nextInt();
                 System.out.print("Hamil [y/t]  : "); 
                 Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y")?true:false;
           
                 Penumpang penumpang = new Penumpang(nama, umur, hamil);
                 bus.naikPenumpang(penumpang);
                 bus.toString();
                 System.out.println("==================================================\n\n");

            }else if (pilihan == 2){ 
                System.out.print("\nPenumpang yang diturunkan : ");
                String nama = in.next();
                bus.turunPenumpang(nama);
                bus.toString();
               System.out.println("==================================================\n\n");
            }else if (pilihan == 3){
            	bus.getJumlahPenumpangBiasa();
                bus.getJumlahPenumpangPrioritas();
                bus.toString(); 
                System.out.println("==================================================\n\n");
            }else if (pilihan == 4){ 
                System.exit(0);
            }else{
                System.out.println("Menu tidak tersedia!");
            }
    } while(berangkat);
}

public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().jalan();
    }
=======
import java.util.Scanner;

public class Main {   
    private static Scanner in;
    private boolean berangkat;
    Bus bus = new Bus();   

public Main() {
        this.berangkat = true;
    }

    public void jalan(){     
      
    do{
    	System.out.println("==================================================");
        System.out.println("===== SELAMAT DATANG DI BUS TRANS KOETARADJA =====");
        System.out.println("==================================================\n");
        System.out.println("=========================");
        System.out.println("|\tMENU\t\t|");
        System.out.println("=========================");
        System.out.println("| 1. Naikkan Penumpang  |");
        System.out.println("| 2. Turunkan Penumpang |");
        System.out.println("| 3. Lihat Penumpang\t|");
        System.out.println("| 4. keluar\t\t|");
        System.out.println("=========================");
        System.out.print("Pilihan: ");
        int pilihan = in.nextInt();
        System.out.println(" ");
  
           if (pilihan == 1) {         
                 System.out.print("Masukan nama : ");
                 String nama = in.next(); 
                 System.out.print("Masukan umur : ");
                 int umur = in.nextInt();
                 System.out.print("Hamil [y/t]  : "); 
                 Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y")?true:false;
           
                 Penumpang penumpang = new Penumpang(nama, umur, hamil);
                 bus.naikPenumpang(penumpang);
                 bus.toString();
                 System.out.println("==================================================\n\n");

            }else if (pilihan == 2){ 
                System.out.print("\nPenumpang yang diturunkan : ");
                String nama = in.next();
                bus.turunPenumpang(nama);
                bus.toString();
               System.out.println("==================================================\n\n");
            }else if (pilihan == 3){
            	bus.getJumlahPenumpangBiasa();
                bus.getJumlahPenumpangPrioritas();
                bus.toString(); 
                System.out.println("==================================================\n\n");
            }else if (pilihan == 4){ 
                System.exit(0);
            }else{
                System.out.println("Menu tidak tersedia!");
            }
    } while(berangkat);
}

public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().jalan();
    }
>>>>>>> bd07b86370a0f42cd2a9a2326927483a007fa2da
}