package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Monte {
    
    private List<Carta> cartas = new ArrayList<Carta>();
    private Carta carta = new Carta();

    public Monte() {
        if(cartas == null){
            for(int i =0; i<10;i++){
                carta.setNumero(i);
                carta.setNaipe(Naipe.Clubs); 
                cartas.add(carta);
            }
            for(int i =0; i<10;i++){
                carta.setNumero(i);
                carta.setNaipe(Naipe.Diamonds); 
                cartas.add(carta);
            }
            for(int i =0; i<10;i++){
                carta.setNumero(i);
                carta.setNaipe(Naipe.Hearts); 
                cartas.add(carta);
            }
            for(int i =0; i<10;i++){
                carta.setNumero(i);
                carta.setNaipe(Naipe.Spades); 
                cartas.add(carta);
            }
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
