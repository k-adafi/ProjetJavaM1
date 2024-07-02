/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaproject;

/**
 *
 * @author KADAFI Ben
 */
public class terrainData {
    
    private String nomT;
    private Integer hauteurT;
    private Integer largeurT;

    public terrainData(String nomT, Integer hauteurT, Integer largeurT) {
        this.nomT = nomT;
        this.hauteurT = hauteurT;
        this.largeurT = largeurT;
    }

    public String getNomT() {
        return nomT;
    }

    public void setNomT(String nomT) {
        this.nomT = nomT;
    }

    public Integer getHauteurT() {
        return hauteurT;
    }

    public void setHauteurT(Integer hauteurT) {
        this.hauteurT = hauteurT;
    }

    public Integer getLargeurT() {
        return largeurT;
    }

    public void setLargeurT(Integer largeurT) {
        this.largeurT = largeurT;
    }

}
