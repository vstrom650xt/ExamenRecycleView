package com.example.examenrecycleview;

import java.io.Serializable;

public class Oficio implements Serializable {

    private String nom;
    private String edad;

    public Oficio(String nom, String edad) {
        this.nom = nom;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public String getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nom + "     " + edad;
    }
}
