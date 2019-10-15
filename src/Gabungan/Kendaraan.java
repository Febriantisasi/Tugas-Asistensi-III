
package Gabungan;

public class Kendaraan {
    private int idKendaraan;
    protected float jarakTempuhAwal;
    protected float jarakTempuh;
    private float bahanBakar;
    

    public Kendaraan(int idKendaraan, float jarakTempuhAwal, float jarakTempuh) {
        this.idKendaraan = idKendaraan;
        this.jarakTempuhAwal = jarakTempuhAwal;
        this.jarakTempuh = jarakTempuh;
    }
    public Kendaraan(){
        
    }
    
    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    public float getBahanBakar(){
        return bahanBakar;
    }
    public void setBahanBakar(float bahanBakar){
        this.bahanBakar=bahanBakar;
    }

    public float totalJarak(){
        float total;
       return total=this.jarakTempuhAwal+this.jarakTempuh;
    }
    public float efektifitas(){
        float efektifitas;
       return efektifitas= (float) ( Math.pow(Math.E, this.jarakTempuh/Math.floor(bahanBakar))*Math.log(2));  
        }
        
    public boolean efektif(){
        if(efektifitas()<0&&efektifitas()<=0.5){
            return true;}
        else{
            return false;
        }
        }
    public String Status(){
        if(efektif()==true){
            return "EFEKTIF";
        }
        else{
            return "TIDAK EFEKTIF";
        }
    }
    
    public void infoKendaraan(){
        System.out.println("ID Kendaraan\t\t= "+getIdKendaraan());
        System.out.println("Jarak Tempuh Awal\t= "+getJarakTempuhAwal());
        System.out.println("Jarak Tempuh\t\t= "+getJarakTempuh());
        System.out.println("Bahan Bakar\t\t="+getBahanBakar());
        System.out.println("Total Jarak\t\t= "+totalJarak());
        System.out.println("Efektifitas\t\t= "+efektifitas());
        System.out.println(Status());
    }

    

   
    
    
}
