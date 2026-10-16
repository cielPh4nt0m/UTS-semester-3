/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.varianN;

/**
 *
 * @author Fadila Mayamasita
 */

public class Kasir {
    private String nama;

    public Kasir(String nama) {
        this.nama = nama;
    }

    public void cetakTagihan(Kamar kamar) {
    
        if (kamar == null) {
            System.out.println("Kamar tidak ditemukan.");
            return;
        }

        if (kamar.isKosong()) {
            System.out.println("Kamar " + kamar.getNomor() + " kosong, tidak ada tagihan.");
            return;
        }

        Pasien p = kamar.getPasien();
        System.out.println("=== Tagihan Kamar " + kamar.getNomor() + " ===");
        System.out.println("Pasien    : " + p.getNama() + " (" + p.getNoRM() + ") - " + p.getJenis());
        
        if (p.getDpjp() != null) {
            System.out.println("DPJP      : dr. " + p.getDpjp().getNama() + " (" + p.getDpjp().getSpesialis() + ")");
        }
        
        System.out.println("Lama Inap : " + p.getLamaInap() + " malam");
        System.out.println("Total     : " + (long) p.hitungBiaya(kamar.getTarifPerMalam()));
    }
}
