/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan59_detektifconan;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan tokoh tokoh
* dan peran dalam film Detektif Conan
 */
public class TokohPendukung extends Tokoh {
    public TokohPendukung(String nama,String peran) {
        super(nama,peran);
    }
    
    public void tampilTokohPendukung(){
        
        TokohPendukung tp = new TokohPendukung("Eisuke Hondo","Tokoh Pendukung");
        System.out.println(tp.peran);
        System.out.println("1. "+tp.nama);
        System.out.println("2. Eri Kisaki, ibu Ran Mouri sekaligus istri "
                + "Kogoro Mouri");
        System.out.println("3. Heiji Hattori, rival dari Conan");
        System.out.println("4. Kazuha Toyama, teman masa kanak-kanak Heiji Hattori");
        System.out.println("5. Kid si Pencuri, seorang pencuri yang jenius dalam"
                + " hal penyamaran dan mengincar batu berharga");
        System.out.println("6. Sonoko Suzuki, sahabat terbaik Ran");
        System.out.println("7. Yusaku Kudo, ayah Shinichi dan suami Yukiko Kudo");
        System.out.println("8. Yukiko Kudo, ibu Shinichi Kudo dan istri Yusaku"
                + " Kudo");
        System.out.println("9. Masumi Sera, Satu kelas dengan Ran Mouri dan "
                + "Sonoko Suzuki");
        System.out.println("10. Makoto Kyogoku, pacar Sonoko Suzuki");


    }
}
