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
public class DetektifCilik extends Tokoh {

    public DetektifCilik(String nama, String peran) {
       super(nama,peran);
    }
  
    
    public void tampilDetektif(){
        
        DetektifCilik dc = new DetektifCilik("Conan Edogawa","Detektif Cilik");
        System.out.println(dc.peran);
        System.out.println("1. "+dc.nama);
        System.out.println("2. Ayumi Yoshida, teman dari "+dc.nama);
        System.out.println("3. Mitsuhiko Tsuburaya, teman Conan Edogawa yang"
                + " pintar dan juga penyuka teknologi ");
        System.out.println("4. Ai Haibara, seorang anggota Organisasi Berbaju"
                + " Hitam yang berkhianat pada organisasi tersebut");
        System.out.println("5. Genta Kojima, pendiri "+dc.peran);
        System.out.println("6. Sumiko Kobayashi, wali kelas Grup Detektif Cilik");
        System.out.println("7. Hiroshi Agasa, profesor linglung yang menemukan"
                + " beberapa perangkat untuk membantu Conan");
       

        
    }
}
