package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {

    private List<Carta> cartas = new ArrayList<Carta>();

    public Monte() {

        for (int i = 1; i < 14; i++) {
            cartas.add(new Carta(i,Naipe.Clubs));
        }
        for (int i = 1; i < 14; i++) {
            cartas.add(new Carta(i,Naipe.Diamonds));
        }
        for (int i = 1; i < 14; i++) {
            cartas.add(new Carta(i,Naipe.Hearts));
        }
        for (int i = 1; i < 14; i++) {
            cartas.add(new Carta(i,Naipe.Spades));
        }

    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta virar() {
        return cartas.remove(0);
    }

}
