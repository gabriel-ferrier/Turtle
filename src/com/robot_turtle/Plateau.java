package com.robot_turtle;

import java.util.ArrayList;

public class Plateau extends Menu {
    private static final int taille = 8;
    public boolean tuile;
    public char[][] plateau;
    public ArrayList<Character> positionTortue;

    public Plateau() {
        this.positionTortue = new ArrayList<Character>();
    }

    public int getTaille() {
        return taille;
    }

    public boolean isTuile() {
        return tuile;
    }

    public void setTuile(boolean tuile) {
        this.tuile = tuile;
    }

    public void initialiserPlateau() {
        plateau = new char[getTaille()][getTaille()];
        for (int i = 0; i < getTaille(); i++) {
            for (int j = 0; j < getTaille(); j++) {
                plateau[i][j] = '0';
            }
        }
        char positionTortue1 = plateau[1][3];
        this.positionTortue.add(positionTortue1);



    }

    public void afficherPlateau() {
        initialiserPlateau();
    }

}
