/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.varianN;

/**
 *
 * @author Fadila Mayamasita
 */

public class Bangsal {
    private String nama;
    private Kamar[] daftarKamar;
    private Dokter kepala;

    public Bangsal(String nama, int jumlahKamar, int tarifPerMalam) {
        this.nama = nama;
        this.daftarKamar = new Kamar[jumlahKamar];
        initKamar(tarifPerMalam);
    }

    private void initKamar(int tarifPerMalam) {
        // Komposisi: Objek Kamar dibuat di dalam class Bangsal
        for (int i = 0; i < daftarKamar.length; i++) {
            daftarKamar[i] = new Kamar(i + 1, tarifPerMalam);
        }
    }

    public void setKepala(Dokter kepala) {
        this.kepala = kepala;
    }

    public Kamar getKamar(int nomor) {
        // Guard clause untuk indeks array
        if (nomor < 1 || nomor > daftarKamar.length) {
            return null;
        }
        return daftarKamar[nomor - 1];
    }

    public void rawatInap(Pasien p) {
        // Menempatkan pasien di kamar kosong pertama
        for (Kamar k : daftarKamar) {
            if (k.isKosong()) {
                k.isiPasien(p);
                break;
            }
        }
    }

    public void rawatInap(Pasien p, int nomorKamar) {
        // Menempatkan pasien di kamar tertentu
        Kamar k = getKamar(nomorKamar);
        if (k != null && k.isKosong()) {
            k.isiPasien(p);
        }
    }

    public void tampilInfo() {
        System.out.println("Bangsal: " + nama);
        if (kepala != null) {
            System.out.println("Kepala Bangsal: dr. " + kepala.getNama() + " (" + kepala.getSpesialis() + ")");
        }
    }
}
