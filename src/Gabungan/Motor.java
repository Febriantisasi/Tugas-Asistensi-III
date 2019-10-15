
package Gabungan;

public class Motor extends Kendaraan{
   private String namaKendaraan;
   private String tipeKendaraan; 
   private float bahanBakar;
   

    public Motor(String namaKendaraan, String tipeKendaraan, float bahanBakar,int idKendaraan, float jarakTempuhAwal, float jarakTempuh) {
        super(idKendaraan, jarakTempuhAwal, jarakTempuh);
        this.namaKendaraan = namaKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.bahanBakar = bahanBakar;
    }
public Motor(){
    
}
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    public float efektifitas(){
        float elektifitas;
        return(float) Math.pow(Math.E, this.jarakTempuh/Math.floor(bahanBakar));       
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
   public String getNama(String nama){
        return nama;
    }
    public String getTipe(String tipe){
        return tipe;
    }
    public void infoKendaraan(){
        System.out.println("Nama\t\t\t="+getNamaKendaraan());
        System.out.println("Tipe\t\t\t= "+getTipeKendaraan());
        super.infoKendaraan();

    }
}
