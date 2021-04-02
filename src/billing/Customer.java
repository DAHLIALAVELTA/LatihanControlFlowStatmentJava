
package billing;

import java.time.LocalDate;

public class Customer {
    public int hitungPembayaranTagihan(int nilaiTagihanPembayaranSebelumDenda, double prosentaseDenda, int tanggalJatuhTempo, int bulanJatuhTempo){
        int nilaiTagihanPembayaranSetelahDenda = nilaiTagihanPembayaranSebelumDenda ;

        LocalDate localDate = LocalDate.now();   //panggil method 
        int tanggalSekarang = localDate.getDayOfMonth();
        int bulanSekarang = localDate.getMonthValue();

        int nilaiDenda;

        if(bulanSekarang > bulanJatuhTempo || (bulanSekarang == bulanJatuhTempo && tanggalSekarang > tanggalJatuhTempo)){// (tanda < RELATIONAL OPERATOR membandingkan nilai yang di kandung dalam variable) 
            nilaiDenda = (int) (prosentaseDenda * nilaiTagihanPembayaranSebelumDenda );
            nilaiTagihanPembayaranSetelahDenda = (int) (nilaiTagihanPembayaranSebelumDenda + nilaiDenda);

         }

        return nilaiTagihanPembayaranSetelahDenda;
    }
}