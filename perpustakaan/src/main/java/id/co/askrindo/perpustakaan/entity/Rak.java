package id.co.askrindo.perpustakaan.entity;

public class Rak {
    
    private Integer id;
    private String namaRak;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaRak() {
        return namaRak;
    }

    public void setNamaRak(String namaRak) {
        this.namaRak = namaRak;
    }

    @Override
    public String toString() {
        return "Rak{" + "id=" + id + ", namaRak=" + namaRak + '}';
    }
        
        
	
}