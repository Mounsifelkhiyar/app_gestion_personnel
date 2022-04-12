/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mounsif elkhiyar
 */
package employe;

import java.sql.Date;

public class employe {
    
    
    private String nom;
    private String prenom;
    private String nom_arab;
    private String prenom_arab;
    private String datenaissance;
    private String daterecrutement;
    private String sex;
    private String cin; 
    private String matricule;
    private int note;

    public employe(String nom, String prenom, String nom_arab, String prenom_arab, String datenaissance, String daterecrutement, String sex, String cin, String matricule,int note) {
        this.nom = nom;
        this.prenom = prenom;
        this.nom_arab = nom_arab;
        this.prenom_arab = prenom_arab;
        this.datenaissance = datenaissance;
        this.daterecrutement = daterecrutement;
        this.sex = sex;
        this.cin = cin;
        this.matricule = matricule;
        this.note=note;
    }

   

    public String getNom()
    {
        return nom ;
    }
    
    public String getPrenom()
    {
        return prenom;
    }
     public String getNom_arab() {
        return nom_arab;
    }

    public String getPrenom_arab() {
        return prenom_arab;
    }
   
     public String getDatenaissance()
    {
        return datenaissance;
    }
      public String getDaterecrutement()
    {
        return daterecrutement;
    }
    public String getSex()
    {
        return sex;
    }
    public String getCin()
    {
        return cin;
    }
    
    public String getMatricule()
    {
        return matricule;
    }
    
    public int getnote() {
        return note;
    }

}
