/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasisimpanpinjam;

import java.util.ArrayList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public abstract class Nasabah {

    protected StringProperty nama;
    protected StringProperty alamat;

    protected ArrayList<Rekening> rekening;

    public Nasabah(String nama, String alamat,
            ArrayList<Rekening> rekening) {

        this.nama = new SimpleStringProperty(nama);
        this.alamat = new SimpleStringProperty(alamat);
        this.rekening = rekening;

    }

    public Nasabah(String nama, String alamat, Rekening rekenings) {
        rekening = new ArrayList<>();

        this.nama = new SimpleStringProperty(nama);
        this.alamat = new SimpleStringProperty(alamat);
        this.rekening.add(rekenings);

    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String alamat) {
        this.alamat.set(alamat);
    }



    public ArrayList<Rekening> getRekening() {
        return rekening;
    }

    public int getRekeningSize() {

        return rekening.size();

    }

    public void setRekening(ArrayList<Rekening> rekening) {
        this.rekening = rekening;
    }

    public StringProperty namaProperty() {
        return nama;
    }

    public StringProperty alamatProperty() {
        return alamat;
    }



    public void tambahRekening(Rekening rek) {
        rekening.add(rek);
    }

    abstract public void print();

}
