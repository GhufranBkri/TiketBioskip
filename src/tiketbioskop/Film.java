/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiketbioskop;

/**
 *
 * @author ghufranb
 */
public class Film {
    private String Nama,Genre, Prosedure, Sutradara, Poduksi, Casts, Sinopsis, GambarFile;
    private int harga;
    public Film() {
        
    }

    public Film(String Nama, String Genre, String Prosedure, String Sutradara, String Poduksi, String Casts, String Sinopsis, String GambarFile,int Harga) {
        this.Nama = Nama;
        this.Genre = Genre;
        this.Prosedure = Prosedure;
        this.Sutradara = Sutradara;
        this.Poduksi = Poduksi;
        this.Casts = Casts;
        this.Sinopsis = Sinopsis;
        this.GambarFile = GambarFile;
        this.harga = Harga;
    }

    
    
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getProsedure() {
        return Prosedure;
    }

    public void setProsedure(String Prosedure) {
        this.Prosedure = Prosedure;
    }

    public String getSutradara() {
        return Sutradara;
    }

    public void setSutradara(String Sutradara) {
        this.Sutradara = Sutradara;
    }

    public String getPoduksi() {
        return Poduksi;
    }

    public void setPoduksi(String Poduksi) {
        this.Poduksi = Poduksi;
    }

    public String getCasts() {
        return Casts;
    }

    public void setCasts(String Casts) {
        this.Casts = Casts;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public String getGambarFile() {
        return GambarFile;
    }

    public void setGambarFile(String GambarFile) {
        this.GambarFile = GambarFile;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
