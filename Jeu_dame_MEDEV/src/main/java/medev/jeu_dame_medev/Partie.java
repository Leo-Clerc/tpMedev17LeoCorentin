import medev.jeu_dame_medev.Piece;

public class Partie {
    ;

    public void deroulement(Board b){
        boolean pasDeVainqueur = true;
        int joueur = -1;
        while(pasDeVainqueur){
            if(joueur == -1){
                System.out.println("Au tour des blancs");
            }
            else{
                System.out.println("Au tour des noirs");
            }
            ArrayList<Piece, Integer> coupJouables = new ArraList<>();
            for(Piece p : b){
                if(p.getColor() == joueur && p.jouable(b, true)){
                    coupJouables.add(p,p.repas(b,true));
                }
                if(p.getColor() == joueur && p.jouable(b, false)){
                    coupJouables.add(p ,p.repas(b,false));
                }
            }
            ArrayList<Piece> coupProposes = top10desPlusGrosMangeages(coupJouables);
            choix = propose(coupPropose);
            deplace(choix);
            
            pasDeVainqueur = checkVictoire();
            joueur *= -1;
        }
        
    }
}
