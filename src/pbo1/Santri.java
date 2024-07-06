
package pbo1;


public class Santri extends Ustad {
    //atribut dan encapsulation
    private String nama;
    private int idSantri;
    
    //construktor
    public Santri(String nama, int idSantri, String asal, int tahunLulus) {
         super(asal, tahunLulus);
         this.nama = nama;
        this.idSantri = idSantri;
    }
    //method (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdSantri(int idSantri) {
        this.idSantri = idSantri;
    }
    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public int getIdSantri() {
        return idSantri;
    }
    
    @Override
    public void displayinfo(){
        super.displayinfo();
         System.out.println ("Nama : "+getNama());
          System.out.println (" Id Santri : "+getIdSantri());
    
}

  
}
    

