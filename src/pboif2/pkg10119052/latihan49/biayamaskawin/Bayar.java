package pboif2.pkg10119052.latihan49.biayamaskawin;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * biaya maskawin berbasis objek
 * 
 */
public class Bayar {
     private double berat,harga;

    Bayar(double berat, double harga) {
        this.berat=berat;
        this.harga=harga;
    }

    public double getBerat() {
        berat = 15.7;
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {
        harga = 570.000;
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double hitungemas(){
        
        return berat*harga;
    } 
    public void tampil(){
        System.out.println("Mahar Nikah =  "+ berat+" gram ");
        System.out.println("Harga =  "+"RP. "+ harga);
        System.out.println("Total bayar yang harus di keluarkan hendi = "+"Rp. "+hitungemas()+" juta ");
    }
}
