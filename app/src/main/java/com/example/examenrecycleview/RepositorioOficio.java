package com.example.examenrecycleview;

import java.util.ArrayList;
import java.util.List;

public class RepositorioOficio {
    private List<Oficio> listaoficio;
    private static RepositorioOficio instance;

    public RepositorioOficio() {
        listaoficio = new ArrayList<>();
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));
        listaoficio.add(new Oficio("jose", "25"));


    }

    public static RepositorioOficio getInstance() {
        if (instance == null)
            instance = new RepositorioOficio();

        return instance;
    }

    public int getSize(){return listaoficio.size();}

    public Oficio get(int i){ return listaoficio.get(i);}

    public ArrayList<Oficio> getAll(){return  new ArrayList<>(listaoficio);}

}
