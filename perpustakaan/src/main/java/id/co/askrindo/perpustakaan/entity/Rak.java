package id.co.askrindo.perpustakaan.entity;

public class Rak {
	Integer id;
	Integer namaRak;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNamaRak() {
        return namaRak;
    }

    public void setNamaRak(Integer namaRak) {
        this.namaRak = namaRak;
    }

    @Override
    public String toString() {
        return "Rak{" + "id=" + id + ", namaRak=" + namaRak + '}';
    }
        
        
	
}