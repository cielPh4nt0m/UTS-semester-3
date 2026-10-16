/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.varianN;

/**
 *
 * @author Fadila Mayamasita
 */

public abstract class Pasien {
    protected String noRM;
    protected String nama;
    protected int lamaInap;
    protected Dokter dpjp;

    public Pasien(String noRM, String nama, int lamaInap) {
        this.noRM = noRM;
        this.nama = nama;
        this.lamaInap = lamaInap;
    }

    public void setDpjp(Dokter dpjp) {
        this.dpjp = dpjp;
    }

    public Dokter getDpjp() {
        return dpjp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoRM() {
        return noRM;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    public abstract double hitungBiaya(int tarifPerMalam);
    public abstract String getJenis();
}