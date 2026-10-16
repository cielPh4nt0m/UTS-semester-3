/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.varianN;

/**
 *
 * @author Fadila Mayamasita
 */
package UTS.varian;

public class MainVarian1 {
    public static void main(String[] args) {
        // 1. Buat Bangsal "Melati" dengan 3 kamar bertarif Rp400.000/malam
        Bangsal melati = new Bangsal("Melati", 3, 400000);

        // 2. Buat Dokter "dr. Rina" sebagai kepala bangsal dan "dr. Andi"
        Dokter drAndi = new Dokter("Andi", "Paru");
        Dokter drRina = new Dokter("Rina", "Penyakit Dalam");
        melati.setKepala(drRina);

        // 3. Buat PasienUmum ("RM-001", "Budi", 3 malam) dengan DPJP dr. Andi, lalu rawatinap(budi)
        PasienUmum budi = new PasienUmum("RM-001", "Budi", 3);
        budi.setDpjp(drAndi);
        melati.rawatInap(budi);

        // 4. Buat PasienBPJS ("RM-002", "Sari", 4 malam, "0001234") dengan DPJP dr. Rina, lalu rawatinap(sari, 3)
        PasienBPJS sari = new PasienBPJS("RM-002", "Sari", 4, "0001234");
        sari.setDpjp(drRina);
        melati.rawatInap(sari, 3);

        // 5. Panggil kasir.cetakTagihan() untuk kamar 1, kamar 3, dan kamar 2
        Kasir kasir = new Kasir("Kasir Utama");
        kasir.cetakTagihan(melati.getKamar(1));
        kasir.cetakTagihan(melati.getKamar(3));
        kasir.cetakTagihan(melati.getKamar(2));
    }
}
