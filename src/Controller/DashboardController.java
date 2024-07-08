/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JPanel;

import Interface.Dashboard;
import Interface.ZonneDessinContrainte;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;


/**
 *
 * @author KADAFI Ben
 */
public class DashboardController extends Thread {

    ZonneDessinContrainte jPanelZoneDessin; 
    JToggleButton rectangleD, ligneD, cercleD, gaumeD;
    JButton jButtonValiderTerrain;

    public DashboardController(ZonneDessinContrainte zoneDessin, JButton vT, JToggleButton rD, JToggleButton lD, JToggleButton cD, JToggleButton gD) {
        jPanelZoneDessin=zoneDessin;
        jButtonValiderTerrain=vT;
        rectangleD=rD;
        ligneD=lD;
        cercleD=cD;
        gaumeD=gD;
    }

    public void doPaint(int x1, int y1, int x2, int y2) {
        if (ligneD.isSelected()) {
           jPanelZoneDessin.ajouterLigne(x1,y1,x2,y2);
  
        }else if(rectangleD.isSelected()){
           jPanelZoneDessin.ajouterRectangle(x1,y1,x2,y2);
   
        }else if(cercleD.isSelected()){
            jPanelZoneDessin.ajouterCercle(x1, y1, x2, y2);
        }else if (gaumeD.isSelected()) {
            jPanelZoneDessin.effacer(x1, y1, x2, y2);
        }    
        jPanelZoneDessin.repaint();
        
        
    }
    
    public void doContrainte(int hauteurTy1, int largeurTx1, int hauteurTy2, int largeurTx2){
        jPanelZoneDessin.ajouterTerrain(hauteurTy1, largeurTx1, hauteurTy2, largeurTx2);
    }
  
}
