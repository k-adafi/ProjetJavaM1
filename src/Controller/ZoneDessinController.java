/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Interface.Dashboard;
import Controller.DashboardController;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author KADAFI Ben
 */
public class ZoneDessinController implements MouseListener{
    
    int x1, y1, x2, y2;
    
    int hauteurTy1, largeurTx1, hauteurTy2, largeurTx2;
    
    DashboardController dash1;
    
    public  ZoneDessinController(DashboardController dash){
        
        dash1=dash;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        largeurTx1=e.getX();
        hauteurTy1=e.getY();
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        x1=e.getX();
        y1=e.getY();
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
          
        x2=e.getX();
        y2=e.getY();
        dash1.doPaint(x1,y1,x2,y2);
        
        largeurTx2=e.getX();
        hauteurTy2=e.getY();
        dash1.doContrainte(hauteurTy1, largeurTx1, hauteurTy2, largeurTx2);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
}
