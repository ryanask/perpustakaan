package id.co.askrindo.perpustakaan.entity;

public class Petugas {
	Integer id;
        String nama;
        String alamat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Petugas{" + "id=" + id + ", nama=" + nama + ", alamat=" + alamat + '}';
    }
        
        
	
	
}