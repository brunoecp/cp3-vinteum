package com.example;

public class Carta{

    private int numero;
    private Naipe naipe;


    public Carta(int numero, Naipe naipe) {
        this.naipe = naipe;
        this.numero = numero;
    }
    public Carta(){
        
    }

    public String imagePath(int numero, Naipe naipe) {
        return "classic-cards/" + this.numero + this.naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Naipe getNaipe() {
        return naipe;
    }


    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }
    
}
