package com.robot_turtle;

import java.util.ArrayList;

public class Jeu {
    private ArrayList<Carte> mes_cartes;
    public Jeu(){
        this.mes_cartes = new ArrayList<>();
        Carte ma_premiere_carte = new Carte();
        this.mes_cartes.add(ma_premiere_carte);
    }

    private void piocher_carte(){
        mes_cartes.get(0).piocher();
    }

    public static void main(String[] args){
        Jeu jeu = new Jeu();
        jeu.piocher_carte();
    }
}
