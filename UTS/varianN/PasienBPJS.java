/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.varianN;

/**
 *
 * @author Fadila Mayamasita
 */

public class PasienBPJS extends Pasien {
    private String noBPJS;

    public PasienBPJS(String noRM, String nama, int lamaInap, String noBPJS) {
        super(noRM, nama, lamaInap);
        this.noBPJS = noBPJS;
    }

    @Override
    public double hitungBiaya(int tarifPerMalam) {
        // Hanya membayar 10% dari biaya dasar
        return 0.10 * (tarifPerMalam * lamaInap);
    }

    @Override
    public String getJenis() {
        return "BPJS";
    }

    public String getNoBPJS() {
        return noBPJS;
    }
}
