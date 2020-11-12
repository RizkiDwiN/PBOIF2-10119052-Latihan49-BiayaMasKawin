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
public class PBOIF210119052Latihan49BiayaMasKawin {

    public static void main(String[] args) {
        Bayar bayar = new Bayar(15.7,570.000);
        bayar.getBerat();
        bayar.getHarga();
        bayar.hitungemas();
        bayar.tampil();
    }
    
}
