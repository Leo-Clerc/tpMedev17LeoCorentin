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
        return (pos.getX()>-1 && pos.getX()<10 && pos.getY()>-1 && pos.getY()<10);
    }
    public static final int Taille_Plateau = 10;
    
   

    public Board(ArrayList<Piece> board) {
        this.board = new ArrayList<Piece>(board);
    }
    
    public Board() {
        
        this.board = new ArrayList<Piece>();
        
        for (int i=0; i<Taille_Plateau;i++) {
            for (int j=0; j<(Taille_Plateau/2)-1;j++) {
                if ((i+j)%2 == 0) {
                    this.board.add(new Pion(1,new Point2D(i,j)));
                }
            }
        } 
        for (int i=0; i<Taille_Plateau;i++) {
            for (int j=(Taille_Plateau/2)+1; j<Taille_Plateau;j++) {
                if ((i+j)%2 == 0) {
                    this.board.add(new Pion(-1,new Point2D(i,j)));
                }
            }
        } 
        
        this.afficheInterface();
        
    }
    
        public int testPos(Point2D testPosition){
        for (Piece p: board) {
            if (p.getPos().equals(testPosition) ) {
                //System.out.println(crea);
                int col= p.getColor();
                if (p.getClass().getName().equals("medev.jeu_dame_medev.Dame")) {
                    return (col*2);
                }  else {
                    return col;
                }
        } 
        }
        return 0;
    };
  
    
    public void afficheInterface(){
        int x = Taille_Plateau;
        int y = Taille_Plateau;
        String delimit = "";
        String nv_ligne ="";
        for(int i = 0;i < x; i++){
                delimit+="____";
            };
        for(int j = 0; j < y; j++){
            nv_ligne = "";
            System.out.println(delimit);
            for(int i = 0; i < x; i++){
                nv_ligne += " ";
                Point2D pos = new Point2D(i,j);
                switch(testPos(pos)){
                    case 0:
                        nv_ligne+="|  ";
                        break;
                    case 1:
                        nv_ligne+="| o";
                        break;    
                    case -1:
                        nv_ligne+="| x";
                        break;
                    case 2:
                        nv_ligne+="| O";
                        break;
                    case -2:
                        nv_ligne+="| X";
                        break;
                };
                };
                nv_ligne += " |";
                
            
            System.out.println(nv_ligne);
            };
            System.out.println("Légende : ");
            System.out.println("J: Vous     G: Guerrier");
            System.out.println("A: Archer   P: Paysan");
            System.out.println("R: Lapin    L: Loup");
            System.out.println("O: Objet");
            
        };
    
    public boolean case_vide(Point2D pos) {
        for (Piece p: board) {
            if (p.getPos().equals(pos)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean test_manger(Pion p, Point2D nvllePos, Point2D nvllePos2) {
        int color = p.getColor();
        int i = 0;
        int j = 0;
        Point2D pos = p.getPos();
        for (Piece pe: board) {
            if ((pe.getPos().equals(nvllePos)) && (pe.getColor() != color) && (this.case_vide(nvllePos2))) {
                return true;
            }
        }
        return false;
    }
    
    public void mange(Pion p, Point2D nvllePos, Point2D nvllePos2) {
        int i = 0;
        for (Piece pe: board) {
            if (pe.getPos().equals(nvllePos)) {
                board.remove(pe);
                p.setPos(nvllePos2);
            }
        
        
    }
    }
}


    
    
    
    
    

