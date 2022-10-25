package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Monte {
    
    private List<Carta> cartas = new ArrayList<Carta>();

    public Monte() {
        if(cartas == null){
            
        }
        
    }
    public void embaralhar() {
        Collections.shuffle(cartas);
    }
    public Carta virar() {
        Carta cartaRetorno = cartas.get(0);
        cartas.remove(0);
        return cartaRetorno;
    }
    
}
