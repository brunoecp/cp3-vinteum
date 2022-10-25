package com.example;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
        jogo.distribuiCartaParaJogador(jogo.getJogador());
        jogo.distribuiCartaParaJogador(jogo.getComputador());
        jogo.acabou();
    }

    public void atualizar(){
        pontosJogador.setText(String.valueOf(jogo.getJogador().getPontos()));
        if(jogo.acabou() == true){
            if(jogo.jogador.getPontos() > jogo.getComputador().getPontos() && jogo.getJogador().getPontos() <= 21){
                resultado.setText("Você ganhou");
            }else if(jogo.jogador.getPontos() == 21 && jogo.computador.getPontos() == 21){
                resultado.setText("Empatou");
            }else{
                resultado.setText("Você perdeu");
            }
        }
        
    }

    public void novoJogo(){
        mesaDoComputador.clearConstraints(mesaDoComputador);
        mesaDoJogador.clearConstraints(mesaDoJogador);
        pontosMesa.setText("Mesa");
        pontosJogador.setText("Você");
        resultado.setText("");
    }

    public void pedirCarta(){
        turno();
    }

    public void parar(){
        jogo.getJogador().setParou(true);
    }
    

     private ImageView imagemCarta(Carta carta) {
        return new ImageView(App.class.getResource(carta.imagePath(carta.getNumero(),carta.getNaipe())).toString());
    }

}
