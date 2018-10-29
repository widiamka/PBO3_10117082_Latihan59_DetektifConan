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
public class PBO3_10117082_Latihan59_DetektifConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("==DAFTAR KARAKTER DETEKTIF CONAN==");
          System.out.println("");
                  
        TokohUtama tu = new TokohUtama("","");
        tu.tampilTokohUtama();
        System.out.println("");
        TokohPendukung tp = new TokohPendukung("","");
        tp.tampilTokohPendukung();
        System.out.println("");
        DetektifCilik dc = new DetektifCilik("","");
        dc.tampilDetektif();
       
    }
    
}
