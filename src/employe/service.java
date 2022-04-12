/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

/**
 *
 * @author mounsif elkhiyar
 */
public class service {
    private String nomserv;
     private String lieuserv;
      private String chefserv;

    public service(String nomserv, String lieuserv, String chefserv) {
        this.nomserv = nomserv;
        this.lieuserv = lieuserv;
        this.chefserv = chefserv;
    }

    public String getNomserv() {
        return nomserv;
    }

    public String getLieuserv() {
        return lieuserv;
    }

    public String getChefserv() {
        return chefserv;
    }
      
}
