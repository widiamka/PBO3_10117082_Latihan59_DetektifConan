/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan59_detektifconan;

/**
 *
 *Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan tokoh tokoh
* dan peran dalam film Detektif Conan
 */
public class TokohUtama extends Tokoh{
    
  public TokohUtama(String nama,String peran) {
        super(nama,peran);
    }
    
    public void tampilTokohUtama(){
        
        TokohUtama tu = new TokohUtama("Shinichi Kudo/Conan Edogawa","Tokoh Utama");
        System.out.println(tu.peran);
        System.out.println("1. "+tu.nama);
        System.out.println("2. Ran Mouri, teman "+tu.nama+" sejak kecil");
        System.out.println("3. Kogoro Mouri, ayah dari Ran Mouri");
    }
    
}
