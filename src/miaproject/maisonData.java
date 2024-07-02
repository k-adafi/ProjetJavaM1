/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaproject;

/**
 *
 * @author KADAFI Ben
 */
public class maisonData {
    
    private String nomM;
    private Integer hautM;
    private Integer basM;
    private Integer gaucheM;
    private Integer droiteM;
    private Integer hauteurM;
    private Integer largeurM;
    private Integer nbrChambreM;

    public maisonData(String nomM, Integer hautM, Integer basM, Integer gaucheM, Integer droiteM, Integer hauteurM, Integer largeurM, Integer nbrChambreM) {
        this.nomM = nomM;
        this.hautM = hautM;
        this.basM = basM;
        this.gaucheM = gaucheM;
        this.droiteM = droiteM;
        this.hauteurM = hauteurM;
        this.largeurM = largeurM;
        this.nbrChambreM = nbrChambreM;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public Integer getHautM() {
        return hautM;
    }

    public void setHautM(Integer hautM) {
        this.hautM = hautM;
    }

    public Integer getBasM() {
        return basM;
    }

    public void setBasM(Integer basM) {
        this.basM = basM;
    }

    public Integer getGaucheM() {
        return gaucheM;
    }

    public void setGaucheM(Integer gaucheM) {
        this.gaucheM = gaucheM;
    }

    public Integer getDroiteM() {
        return droiteM;
    }

    public void setDroiteM(Integer droiteM) {
        this.droiteM = droiteM;
    }

    public Integer getHauteurM() {
        return hauteurM;
    }

    public void setHauteurM(Integer hauteurM) {
        this.hauteurM = hauteurM;
    }

    public Integer getLargeurM() {
        return largeurM;
    }

    public void setLargeurM(Integer largeurM) {
        this.largeurM = largeurM;
    }

    public Integer getNbrChambreM() {
        return nbrChambreM;
    }

    public void setNbrChambreM(Integer nbrChambreM) {
        this.nbrChambreM = nbrChambreM;
    }
  
}
