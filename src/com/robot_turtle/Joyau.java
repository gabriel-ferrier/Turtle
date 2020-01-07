package com.robot_turtle;

public class Joyau extends Plateau {
    //TODO: completer la classe

    public int nombreJoyaux = getNombre_joueurs() - 1;
    public int numeroJoyau;
    public String couleurJoyau;

    public Joyau() {
    }

    public int getNombreJoyaux() {
        return nombreJoyaux;
    }

    public int getNumeroJoyau() {
        return numeroJoyau;
    }


}
