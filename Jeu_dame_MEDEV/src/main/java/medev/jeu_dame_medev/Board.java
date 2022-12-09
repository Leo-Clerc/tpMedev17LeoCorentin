/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medev.jeu_dame_medev;

import java.util.ArrayList;

/**
 *
 * @author coco
 */
public class Board {
    
    private ArrayList<Piece> board;
    
    public boolean estDansLePlateau(Point2D pos){
        return (pos.getX()>-1 && pos.getX()<10 && pos.getY()>-1 && pos.getY()<10)
    }
    
}
