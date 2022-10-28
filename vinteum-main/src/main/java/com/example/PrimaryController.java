package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class PrimaryController {

    @FXML private HBox mesaDoJogador;
    @FXML private HBox mesaDoComputador;
    @FXML private ImageView monte;

    @FXML private Label pontosMesa;
    @FXML private Label pontosJogador;
    @FXML private Label resultado;

    private Jogo jogo = new Jogo();

    private void turno(){
        Carta distribuiCartaParaJogador = jogo.distribuiCartaParaJogador(jogo.getJogador());
        Carta distribuiCartaParaJogador2 = jogo.distribuiCartaParaJogador(jogo.getComputador());
        if (distribuiCartaParaJogador != null){
        mesaDoJogador.getChildren().add(imagemCarta(distribuiCartaParaJogador));
        }
        if (distribuiCartaParaJogador2 != null){
            mesaDoComputador.getChildren().add(imagemCarta(distribuiCartaParaJogador2));
        }
        atualizar();
    }

    private void atualizar(){
        pontosJogador.setText(String.valueOf(jogo.getJogador().getPontos()));
        pontosMesa.setText(String.valueOf(jogo.computador.getPontos()));
        if(jogo.acabou() == true){
            if(jogo.jogador.getPontos() > 21 && jogo.getComputador().getPontos() > 21){
                if(jogo.getJogador().getPontos()< jogo.getComputador().getPontos()){
                    resultado.setText("Você ganhou");    
                }else{
                    resultado.setText("Você perdeu");
                }
            }else if(jogo.getJogador().getPontos() > 21){
                resultado.setText("Você perdeu");
            }
            else if(jogo.getJogador().getPontos() > jogo.getComputador().getPontos()){
                resultado.setText("Você ganhou");
            }else if(jogo.jogador.getPontos() == jogo.computador.getPontos() && jogo.computador.getPontos() == jogo.jogador.getPontos()){
                resultado.setText("Empatou");
            }else{
                resultado.setText("Você ganhou");
            }
        }
        
    }

    public void novoJogo(){
        pontosMesa.setText("Mesa");
        pontosJogador.setText("Você");
        resultado.setText("");
        mesaDoJogador.getChildren().clear();
        mesaDoComputador.getChildren().clear();
        jogo = new Jogo();
    }

    public void pedirCarta(){
        turno();
    }

    public void parar(){
        jogo.getJogador().setParou(true);
    }
    
     private ImageView imagemCarta(Carta carta) {
        String pathCarta = carta.imagePath();
        System.out.println(pathCarta);
        return new ImageView(App.class.getResource(pathCarta).toString());
    }

}
