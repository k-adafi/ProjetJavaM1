/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.Color;

/**
 *
 * @author KADAFI Ben
 */
public class MyObjectController {
    
    public int x1, y1, x2, y2;
    public Color color;

    public MyObjectController(int x1, int y1, int x2, int y2, Color c) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        color=c;
    }

        
    public int getWidth(){
        return Math.abs(x1-x2);
    }
    
    public int getHeight(){
        return Math.abs(y1-y2);
    }
    
    public int getMinX(){
        if (x1<x2) return x1;
        else return x2;
    }
    
    public int getMinY(){
        if (y1<y2) return y1;
        else return y2;
    }
    
    
    
    public boolean isInside(int x1, int y1, int x2, int y2) {
        int minX = getMinX();
        int minY = getMinY();
        int maxX = minX + getWidth();
        int maxY = minY + getHeight();
        return minX >= x1 && minY >= y1 && maxX <= x2 && maxY <= y2;
    }
}
