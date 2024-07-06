
package pbo1;


public class Ustad  {
    
    //atribut dan encapsulation
    private String asal;
    private int tahunLulus;
    
    //construktor
    public Ustad (String asal, int tahunLulus) {
        this.asal = asal;
        this.tahunLulus = tahunLulus;
    }
    //method (setter)
    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setTahunLulus(int tahunLulus) {
        this.tahunLulus = tahunLulus;
    }

    //accessor (getter)
    public String getAsal() {
        return asal;
    }

    public int getTahunLulus() {
        return tahunLulus;
    }
    public void displayinfo(){
       
         System.out.println ( "Asal : "+getAsal());
         System.out.println ( " Tahun lulus : "+getTahunLulus());
}

 
   
}
