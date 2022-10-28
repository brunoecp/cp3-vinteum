package com.example;

public class Jogo {

    Jogador jogador = new Jogador();
    Monte monte = new Monte();
    Computador computador = new Computador();
    
    public Jogo(){
        monte.embaralhar();
    }
    public Carta distribuiCartaParaJogador(Jogador jogador) {
        if(!jogador.parou()){
            Carta novaCarta = monte.virar();
            jogador.receberCarta(novaCarta);
            System.out.println(novaCarta.toString());
            return novaCarta;
        }
        return null;
    }
    public boolean acabou() {
        if(jogador.getPontos() > 21 || computador.getPontos() > 21){
            jogador.setParou(true);
            return true;
        }else if(jogador.isParou() == true && computador.parou() == true){
            jogador.setParou(true);
            return true;
        }

        return false;
    }
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    public Computador getComputador() {
        return computador;
    }
    public void setComputador(Computador computador) {
        this.computador = computador;
    }
    
}
