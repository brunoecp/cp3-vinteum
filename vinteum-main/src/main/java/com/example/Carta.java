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


    public String imagePath() {
        if(numero ==1){
            String palavra = "Ace";
            return "classic-cards/" + palavra + this.naipe + ".png";
        }else if(numero == 11){
            String palavra = "Jack";
            return "classic-cards/" + palavra + this.naipe + ".png";
        }else if(numero == 12){
            String palavra = "King";
            return "classic-cards/" + palavra + this.naipe + ".png";
        }else if(numero == 13){
            String palavra = "Queen";
            return "classic-cards/" + palavra + this.naipe + ".png";
        }
        return "classic-cards/" + numero + this.naipe + ".png";
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


    @Override
    public String toString() {
        return "Carta [numero=" + numero + ", naipe=" + naipe + "]";
    }

    
    
}
