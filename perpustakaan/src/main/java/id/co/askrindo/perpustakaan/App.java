package id.co.askrindo.perpustakaan;

import id.co.askrindo.perpustakaan.entity.Petugas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Petugas petugas1 = new Petugas();
        petugas1.setId(1);
        petugas1.setNama("ryan");
        petugas1.setAlamat("Bojong");
        
        System.out.println("id :"+petugas1.getId());
        System.out.println("nama :"+petugas1.getNama());
        System.out.println("alamat :"+petugas1.getAlamat());
    }
}
