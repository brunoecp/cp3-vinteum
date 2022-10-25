package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<Carta>();
    private boolean parou = false;

    public Jogador(int pontos, boolean parou) {
        this.pontos = pontos;
        this.parou = parou;
    }
    public Jogador(){
        
    }

    public void receberCarta(Carta carta) {
        cartas.add(carta);
        setPontos(getPontos() + carta.getNumero());
    }
    public void parar() {
        setParou(true);
    }
    public int getPontos() {
        return pontos;
    }
    public boolean parou() {
        return isParou();
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public boolean isParou() {
        return parou;
    }
    public void setParou(boolean parou) {
        this.parou = parou;
    }
    public List<Carta> getCartas() {
        return cartas;
    }
    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    
}
