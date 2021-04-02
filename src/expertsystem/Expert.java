/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expertsystem;

public class Expert {
    public boolean isAceticAcid(boolean bentukTumpahan, int nilaiPH, boolean bauTumpahan) {   //method

        boolean jenisTumpahan = true; //jika true menghasilkan true semua di aplikasi,dan ik false menghasilkan tru di awal dan false semua sampai akhir 
        
        if(bentukTumpahan == true && nilaiPH < 6 && bauTumpahan == true) {//jika true di ganti false mka semua akan berubah false pada main.aplikasi lat 5 
            jenisTumpahan = true;
        }
         return jenisTumpahan;
    }
}
    
