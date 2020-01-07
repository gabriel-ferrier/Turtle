package com.robot_turtle;

import java.util.ArrayList;

public class Joueur {
     public int numero;
     public ArrayList<String> deck = new ArrayList<String>();
     public ArrayList<String> jeuPerso = new ArrayList<String>();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDeck(ArrayList<String> deck) {
        this.deck = deck;
    }

    public void setJeuPerso(ArrayList<String> jeuPerso) {
        this.jeuPerso = jeuPerso;
    }

    public ArrayList<String> getDeck() {
        return deck;
    }

    public ArrayList<String> getJeuPerso() {
        return jeuPerso;
    }


}
