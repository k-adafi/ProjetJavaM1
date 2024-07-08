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
    
    private Integer hauteurTy1;
    private Integer largeurTx1;
    private Integer hauteurTy2;
    private Integer largeurTx2;

    public terrainData(Integer hauteurTy1, Integer largeurTx1, Integer hauteurTy2, Integer largeurTx2) {
   
        this.hauteurTy1 = hauteurTy1;
        this.largeurTx1 = largeurTx1;
        this.hauteurTy2 = hauteurTy2;
        this.largeurTx2 = largeurTx2;
    }
    
    public int getWidth(){
        return Math.abs(largeurTx1-largeurTx2);
    }
    
    public int getHeight(){
        return Math.abs(hauteurTy1-hauteurTy2);
    }
    
    public int getMinX(){
        if (largeurTx1<largeurTx2) return largeurTx1;
        else return largeurTx2;
    }
    
    public int getMinY(){
        if (hauteurTy1<hauteurTy2) return hauteurTy1;
        else return hauteurTy2;
    }
}
