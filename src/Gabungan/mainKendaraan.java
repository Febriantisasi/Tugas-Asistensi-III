/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gabungan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class mainKendaraan {
  public static void main(String[]args){
     Scanner input=new Scanner(System.in);

      
      System.out.println("*WELCOME TO VEHICLE WAREHOUSE*");
      System.out.println();
      
      Kendaraan kd=new Kendaraan();
      Mobil mb=new Mobil();
      Motor mt=new Motor();
      
      String k;
      System.out.println("Masukkan pilihan= ");
      k=input.nextLine();
      
      if("Kendaraan".equals(k)){
      System.out.println("ID Kendaraan\t= ");
      int idKendaraan=input.nextInt();
      System.out.println("Jarak Tempuh Awal\t= ");
      float jarakTempuhAwal=input.nextFloat();
      System.out.println("Jarak Tempuh \t= ");
      float jarakTempuh=input.nextFloat();
      System.out.println("Bahan Bakar\t= ");
      float bahanBakar=input.nextFloat();
      
          System.out.println();
      kd.setIdKendaraan(idKendaraan);
      kd.setJarakTempuhAwal(jarakTempuhAwal);
      kd.setJarakTempuh(jarakTempuh);
      kd.setBahanBakar(bahanBakar);
      kd.infoKendaraan();
      }
      
      System.out.println();
      
      if("Mobil".equals(k)){       
          
          System.out.println("ID Kendaraan\t\t= ");
          int id=input.nextInt();
          mb.setIdKendaraan(id);
          
          System.out.println("Jarak Tempuh Awal\t= ");
          float jta=input.nextFloat();
          mb.setJarakTempuhAwal(jta);
          
          System.out.println("Jarak Tempuh\t\t= ");
          float jt=input.nextFloat();
          mb.setJarakTempuh(jt);
          
        System.out.println("Nama Kendaraan\t= ");
        String nama=input.next();
        mb.setNamaKendaraan(nama);

        System.out.println("Tipe Kendaraan\t= ");
        String tipe=input.next();
        mb.setTipeKendaraan(tipe);

        System.out.println("Kapasitas Mesin= ");
        int kapasitas1=input.nextInt();
        mb.setKapasitasMesin(kapasitas1);

        System.out.println("Bahan Bakar\t\t= ");
        float bahanbakar1=input.nextFloat();
        mb.setBahanBakar(bahanbakar1);
        System.out.println();
        
        System.out.println("===============");
        mb.infoKendaraan();
        
      }
      if("Motor".equals(k)){
        System.out.println("ID Kendaraan\t\t= ");
        int id=input.nextInt();
        mt.setIdKendaraan(id);
          
        System.out.println("Jarak Tempuh Awal\t= ");
        float jta=input.nextFloat();
        mt.setJarakTempuhAwal(jta);
          
        System.out.println("Jarak Tempuh\t\t= ");
        float jt=input.nextFloat();
        mt.setJarakTempuh(jt);
          
        System.out.println("Nama Kendaraan\t\t= ");
        String nama2=input.next();
        mt.setNamaKendaraan(nama2);

        System.out.println("Tipe Kendaraan\t\t= ");
        String tipe2=input.next();
        mt.setTipeKendaraan(tipe2);

        System.out.println("Bahan Bakar\t\t= ");
        float bahanbakar2=input.nextFloat();
        mt.setBahanBakar(bahanbakar2);
          
        mt.infoKendaraan();
      }
        
        
        
      
      
  }  
}
