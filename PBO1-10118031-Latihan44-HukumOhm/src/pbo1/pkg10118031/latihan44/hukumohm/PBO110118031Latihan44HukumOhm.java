package pbo1.pkg10118031.latihan44.hukumohm;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk Menghitung Ohm
 */
public class PBO110118031Latihan44HukumOhm {

    public static void main(String[] args) {

        Baterai baterai = new Baterai();
        Baterai ohm = new Baterai(3, 12);
        System.out.println("Kuat Arus : " + ohm.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + ohm.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + ohm.hitungTegangan() + " volt");
    }

}
