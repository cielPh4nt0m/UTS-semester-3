/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.varianN;

/**
 *
 * @author Fadila Mayamasita
 */

public class PasienUmum extends Pasien {

    public PasienUmum(String noRM, String nama, int lamaInap) {
        super(noRM, nama, lamaInap);
    }

    @Override
    public double hitungBiaya(int tarifPerMalam) {
        // Biaya dasar + biaya administrasi Rp150.000
        return (double) tarifPerMalam * lamaInap + 150000;
    }

    @Override
    public String getJenis() {
        return "Umum";
    }
}  

