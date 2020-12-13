<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    private static Scanner in;
    ArrayList<Penumpang> penumpangBiasa;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> semuaPenumpang;
   
    public Bus(){
       penumpangBiasa =  new ArrayList<Penumpang>();
       penumpangPrioritas =  new ArrayList<Penumpang>();
       semuaPenumpang = new ArrayList<Penumpang>();
    }
      
    public ArrayList<Penumpang> getPenumpangBiasa(){ 
        for(Penumpang penumpang:penumpangBiasa)
        {
            penumpang.getNama();
        }
        return penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas(){    
        for(Penumpang penumpang : penumpangPrioritas)
        {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa(){
        int jumlahBiasa = penumpangBiasa.size();
        System.out.println("jumlah penumpang biasa: " +jumlahBiasa);

        return jumlahBiasa;
    }
    
    public int getJumlahPenumpangPrioritas(){
        int jumlahPrioritas = penumpangPrioritas.size();
        System.out.println("jumlah penumpang prioritas : " +jumlahPrioritas);

        return jumlahPrioritas;
    }
    
    public boolean naikPenumpang (Penumpang penumpang){
        int biasa=4;
        int prioritas=2;
        if((penumpangPrioritas.size() < prioritas ) && (penumpang.getUmur()< 15 || penumpang.getUmur() > 50) || (penumpang.getHamil()==true)){
            System.out.println("Penumpang bernama "+penumpang.getNama()+" berhasil ditambahkan!");
            return penumpangPrioritas.add(penumpang);
        }
        else if(penumpangBiasa.size() < biasa){
            System.out.println("Penumpang bernama "+penumpang.getNama()+" berhasil ditambahkan!");
            return penumpangBiasa.add(penumpang); 
        } else{
            System.out.print("Penumpang bernama " +penumpang.getNama()+ " gagal ditambahkan!");
            System.out.println("Tidak Ada Kursi Kosong!\n");
            return false;
        } 
    }
    
    public boolean turunPenumpang(String nama){
      for (int i=0; i<penumpangBiasa.size(); i++) {  
          if(nama.equals(penumpangBiasa.get(i).getNama())){
            penumpangBiasa.remove(i);
            System.out.println("penumpang "+nama+" telah diturunkan!");
            return penumpangBiasa.equals(nama);
           } 
        }
           
      for (int i=0; i <penumpangPrioritas.size(); i++) {  
          if(nama.equals(penumpangPrioritas.get(i).getNama())){
             penumpangPrioritas.remove(i);
            System.out.println("penumpang bernama "+nama+" telah diturunkan!");
            return penumpangPrioritas.equals(nama);
            }
        }
        
    for (int i = 0; i < semuaPenumpang.size(); i ++) {  
        if(( nama !=(penumpangPrioritas.get(i).getNama()) || (nama != penumpangBiasa.get(i).getNama()))){
          System.out.println("Tidak Ada penumpang"); 
          return false;
          }
       } 
       return penumpangPrioritas.equals(nama);
    }

  public int getJumlahsemuapenumpang(){
        return penumpangBiasa.size() + penumpangPrioritas.size();
    }

  public ArrayList<Penumpang> semuaPenumpang()
    { 
        semuaPenumpang = penumpangBiasa;
        semuaPenumpang = penumpangPrioritas;
        semuaPenumpang.addAll(penumpangPrioritas);
        
        for(Penumpang penumpang : semuaPenumpang)
        {
            System.out.print(penumpang.getNama() );
        }
        return semuaPenumpang;
    }

    public String toString(){
           String biasa = " ";
           String prioritas = " ";
           System.out.println(" ");
           
           for(Penumpang penumpang : penumpangBiasa) {
               biasa += ( "{"+ penumpang.getNama().toString() +"}"+" "); 
            }
           for(Penumpang penumpang : penumpangPrioritas) {
               prioritas += ("{"+ penumpang.getNama().toString() +"}"+" ");
            }
            

          if(penumpangBiasa.isEmpty() == true ){  
              System.out.println("daftar nama penumpang Biasa = kosong") ;
          }else{
              System.out.println("daftar nama penumpang biasa = " +biasa );
          }
            
          if(penumpangPrioritas.isEmpty() == true ){  
              System.out.println("daftar nama penumpang prioritas = kosong") ;
          }else{
              System.out.println("daftar nama penumpang prioritas = " +prioritas );
          }
          
            System.out.println("jumlah semua penumpang = " +getJumlahsemuapenumpang());
           
        return "daftar nama penumpang biasa = "+biasa+"daftar nama penumpang prioritas = "+prioritas+"jumlah semua penumpang = "+getJumlahsemuapenumpang()+"\n";
    }
=======
import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    private static Scanner in;
    ArrayList<Penumpang> penumpangBiasa;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> semuaPenumpang;
   
    public Bus(){
       penumpangBiasa =  new ArrayList<Penumpang>();
       penumpangPrioritas =  new ArrayList<Penumpang>();
       semuaPenumpang = new ArrayList<Penumpang>();
    }
      
    public ArrayList<Penumpang> getPenumpangBiasa(){ 
        for(Penumpang penumpang:penumpangBiasa)
        {
            penumpang.getNama();
        }
        return penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas(){    
        for(Penumpang penumpang : penumpangPrioritas)
        {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa(){
        int jumlahBiasa = penumpangBiasa.size();
        System.out.println("jumlah penumpang biasa: " +jumlahBiasa);

        return jumlahBiasa;
    }
    
    public int getJumlahPenumpangPrioritas(){
        int jumlahPrioritas = penumpangPrioritas.size();
        System.out.println("jumlah penumpang prioritas : " +jumlahPrioritas);

        return jumlahPrioritas;
    }
    
    public boolean naikPenumpang (Penumpang penumpang){
        int biasa=4;
        int prioritas=2;
        if((penumpangPrioritas.size() < prioritas ) && (penumpang.getUmur()< 15 || penumpang.getUmur() > 50) || (penumpang.getHamil()==true)){
            System.out.println("Penumpang bernama "+penumpang.getNama()+" berhasil ditambahkan!");
            return penumpangPrioritas.add(penumpang);
        }
        else if(penumpangBiasa.size() < biasa){
            System.out.println("Penumpang bernama "+penumpang.getNama()+" berhasil ditambahkan!");
            return penumpangBiasa.add(penumpang); 
        } else{
            System.out.print("Penumpang bernama " +penumpang.getNama()+ " gagal ditambahkan!");
            System.out.println("Tidak Ada Kursi Kosong!\n");
            return false;
        } 
    }
    
    public boolean turunPenumpang(String nama){
      for (int i=0; i<penumpangBiasa.size(); i++) {  
          if(nama.equals(penumpangBiasa.get(i).getNama())){
            penumpangBiasa.remove(i);
            System.out.println("penumpang "+nama+" telah diturunkan!");
            return penumpangBiasa.equals(nama);
           } 
        }
           
      for (int i=0; i <penumpangPrioritas.size(); i++) {  
          if(nama.equals(penumpangPrioritas.get(i).getNama())){
             penumpangPrioritas.remove(i);
            System.out.println("penumpang bernama "+nama+" telah diturunkan!");
            return penumpangPrioritas.equals(nama);
            }
        }
        
    for (int i = 0; i < semuaPenumpang.size(); i ++) {  
        if(( nama !=(penumpangPrioritas.get(i).getNama()) || (nama != penumpangBiasa.get(i).getNama()))){
          System.out.println("Tidak Ada penumpang"); 
          return false;
          }
       } 
       return penumpangPrioritas.equals(nama);
    }

  public int getJumlahsemuapenumpang(){
        return penumpangBiasa.size() + penumpangPrioritas.size();
    }

  public ArrayList<Penumpang> semuaPenumpang()
    { 
        semuaPenumpang = penumpangBiasa;
        semuaPenumpang = penumpangPrioritas;
        semuaPenumpang.addAll(penumpangPrioritas);
        
        for(Penumpang penumpang : semuaPenumpang)
        {
            System.out.print(penumpang.getNama() );
        }
        return semuaPenumpang;
    }

    public String toString(){
           String biasa = " ";
           String prioritas = " ";
           System.out.println(" ");
           
           for(Penumpang penumpang : penumpangBiasa) {
               biasa += ( "{"+ penumpang.getNama().toString() +"}"+" "); 
            }
           for(Penumpang penumpang : penumpangPrioritas) {
               prioritas += ("{"+ penumpang.getNama().toString() +"}"+" ");
            }
            

          if(penumpangBiasa.isEmpty() == true ){  
              System.out.println("daftar nama penumpang Biasa = kosong") ;
          }else{
              System.out.println("daftar nama penumpang biasa = " +biasa );
          }
            
          if(penumpangPrioritas.isEmpty() == true ){  
              System.out.println("daftar nama penumpang prioritas = kosong") ;
          }else{
              System.out.println("daftar nama penumpang prioritas = " +prioritas );
          }
          
            System.out.println("jumlah semua penumpang = " +getJumlahsemuapenumpang());
           
        return "daftar nama penumpang biasa = "+biasa+"daftar nama penumpang prioritas = "+prioritas+"jumlah semua penumpang = "+getJumlahsemuapenumpang()+"\n";
    }
>>>>>>> bd07b86370a0f42cd2a9a2326927483a007fa2da
}