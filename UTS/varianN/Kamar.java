/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.varianN;

/**
 *
 * @author Fadila Mayamasita
 */

public class Kamar {
    private int nomor;
    private int tarifPerMalam;
    private Pasien pasien;

    public Kamar(int nomor, int tarifPerMalam) {
        this.nomor = nomor;
        this.tarifPerMalam = tarifPerMalam;
        this.pasien = null;
    }

    public void isiPasien(Pasien p) {
        this.pasien = p;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public boolean isKosong() {
        return pasien == null;
    }

    public int getNomor() {
        return nomor;
    }

    public int getTarifPerMalam() {
        return tarifPerMalam;
    }
}
