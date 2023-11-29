package oop;
import java.util.Scanner;
class karyawan{
    private int nik;
    private String nama;
    private String jabatan;
    private int golongan;
  
    
    public int getnik(){
        return nik;
    }
    
    public void setnik(int nik){
        this.nik = nik;
    }
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getjabatan(){
        return jabatan;
    }
    
    public void setjabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public int getgolongan(){
        return golongan;
    }
    
    public void setgolongan(int golongan){
        this.golongan = golongan;
    }
}

class manager extends karyawan{
    private int kehadiran;
    private float tunjangangolongan;
    private float tunjanganjabatan;
    private float tunjangankehadiran;
   
    public int getkehadiran(){
        return kehadiran;
    }
    
    public void setkehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
    public float tunjangangolongan(int golongan){
        if(golongan == 1){
            tunjangangolongan = 500000;
        }else if(golongan == 2){
            tunjangangolongan = 1000000;
        }else if(golongan == 3){
            tunjangangolongan = 1500000;
        }else{
            System.out.println("Tidak ada golongan");
        }
        return tunjangangolongan;
    }
    
    public float tunjangankehadiran(int kehadiran){
        tunjangankehadiran = kehadiran * 10000;
        return tunjangankehadiran;
    }
    
    public float tunjanganjabatan(String jabatan){
        if(jabatan.equals("manager")){
            tunjanganjabatan = 2000000;
        }else if(jabatan.equals("kabag")){
            tunjanganjabatan = 1000000;
        }
        return tunjanganjabatan;
    }
    
    public float totalgaji(){
        return tunjangangolongan + tunjanganjabatan + tunjangankehadiran;
    }
}

public class Latihan51_GajiKaryawan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        manager manager1 = new manager();
        System.out.println("======== PROGRAM PERHITUNGAN GAJI KARYAWAN ========");
        System.out.print("Masukan nik : ");
        manager1.setnik(input.nextInt());
        System.out.print("Masukan nama : ");
        manager1.setnama (input.next());
        System.out.print("Masukan Golongan (1/2/3) : ");
        manager1.setgolongan(input.nextInt());
        System.out.print("Masukan Jabatan (Manager/kabag) : ");
        manager1.setjabatan(input.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        manager1.setkehadiran(input.nextInt());
        System.out.println("");
        
        System.out.println("======== HASIL PERHITUNGAN  ========");
        System.out.println("Nik : " + manager1.getnik());
        System.out.println("Nama : " + manager1.getnama());
        System.out.println("Golongan : " + manager1.getgolongan());
        System.out.println("Jabatan : " + manager1.getjabatan());
        System.out.println("");
        
        System.out.println("Tunjangan golongan " + manager1.tunjangangolongan(manager1.getgolongan()));
        System.out.println("Tunjangan Jabatan : " + manager1.tunjanganjabatan(manager1.getjabatan()));
        System.out.println("Tunjangan Jabatan : " + manager1.tunjangankehadiran(manager1.getkehadiran()));
        System.out.println("Total Gaji : " + manager1.totalgaji());
    }
}