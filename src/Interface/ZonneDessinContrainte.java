/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interface;

import Controller.MyObjectController;
import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;
import miaproject.terrainData;

/**
 *
 * @author KADAFI Ben
 */
public class ZonneDessinContrainte extends javax.swing.JPanel {

    /**
     * Creates new form ZonneDessinContrainte
     */
    
    List<MyObjectController> ligne, rectangle, cercle;
    
    List<terrainData> terrain;
    
    Color color = Color.BLACK;

    public ZonneDessinContrainte() {
        initComponents();        
                
        ligne = new LinkedList<>();
        rectangle = new LinkedList<>();
        cercle = new LinkedList<>();
        
        terrain = new LinkedList<>();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(708, 302));
    }// </editor-fold>//GEN-END:initComponents

    public void ajouterLigne(int x1, int y1, int x2, int y2) {
        ligne.add(new MyObjectController(x1, y1, x2, y2, color));
    }

    public void ajouterRectangle(int x1, int y1, int x2, int y2) {
        rectangle.add(new MyObjectController(x1, y1, x2, y2, color));
    }
    
    public void ajouterCercle(int x1, int y1, int x2, int y2) {
        cercle.add(new MyObjectController(x1, y1, x2, y2, color));
    }
    
    public void setColor(Color c) {
        color=c;
    }
    
    public void effacer(int x1, int y1, int x2, int y2) {
        // Supprimer les éléments de la liste s'ils sont à l'intérieur des coordonnées (x1, y1) et (x2, y2)
        ligne.removeIf(obj -> obj.isInside(x1, y1, x2, y2));
        rectangle.removeIf(obj -> obj.isInside(x1, y1, x2, y2));
        cercle.removeIf(obj -> obj.isInside(x1, y1, x2, y2));
    }
    

    public void ajouterTerrain(int hauteurTy1, int largeurTx1, int hauteurTy2, int largeurTx2) {
        
        hauteurTy1 = getData.hauteurTy1;
        largeurTx1 = getData.largeurTx1;
        hauteurTy2 = getData.hauteurTy2;
        largeurTx2 = getData.largeurTx2;
        
        terrain.add(new terrainData(hauteurTy1, largeurTx1, hauteurTy2, largeurTx2));
    }

    
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        
        for (MyObjectController myObjectLigne : ligne) {
            g.setColor(myObjectLigne.color);
            g.drawLine(myObjectLigne.x1, myObjectLigne.y1, myObjectLigne.x2, myObjectLigne.y2);
            
        }
        
        for (MyObjectController myObjectRectangle : rectangle) {
            g.setColor(myObjectRectangle.color);
            g.drawRect(myObjectRectangle.getMinX(), myObjectRectangle.getMinY(), myObjectRectangle.getWidth(), myObjectRectangle.getHeight());
        }
        
        for (MyObjectController myObjectCercle : cercle) {
            g.setColor(myObjectCercle.color);
            g.drawOval(myObjectCercle.getMinX(), myObjectCercle.getMinY(), myObjectCercle.getWidth(), myObjectCercle.getHeight());
        }
        
        for (terrainData myObjectTerrain : terrain) {
            g.drawRect(myObjectTerrain.getMinX(), myObjectTerrain.getMinY(), myObjectTerrain.getWidth(), myObjectTerrain.getHeight());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
