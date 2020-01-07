package com.robot_turtle;

public class Tortue extends Plateau{
    public int numeroTortue;
    public int nombreTortues = getNombre_joueurs();
    public String couleurTortue;

    public Tortue(){
    }

    public int getNombreTortues() {
        return nombreTortues;
    }

    public int getNumeroTortue() {
        return numeroTortue;
    }


}
