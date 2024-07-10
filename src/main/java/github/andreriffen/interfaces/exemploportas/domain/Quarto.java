package github.andreriffen.interfaces.exemploportas.domain;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public class Quarto {
    private List<Janela> janelas;
    private List<Porta> portas;

    // Construtor padrão
    public Quarto() {
        this.janelas = new ArrayList<>();
        this.portas = new ArrayList<>();
    }

    // Métodos para adicionar janelas e portas
    public void adicionarJanela(Janela janela) {
        this.janelas.add(janela);
    }

    public void adicionarPorta(Porta porta) {
        this.portas.add(porta);
    }

    // Métodos para interagir com as janelas
    public void abrirTodasAsJanelas() {
        for (Janela janela : janelas) {
            janela.abrir();
        }
    }

    public void fecharTodasAsJanelas() {
        for (Janela janela : janelas) {
            janela.fechar();
        }
    }

    public void travarTodasAsJanelas() {
        for (Janela janela : janelas) {
            janela.travar();
        }
    }

    public void destravarTodasAsJanelas() {
        for (Janela janela : janelas) {
            janela.destravar();
        }
    }

    // Métodos para interagir com as portas
    public void abrirTodasAsPortas() {
        for (Porta porta : portas) {
            porta.abrir();
        }
    }

    public void fecharTodasAsPortas() {
        for (Porta porta : portas) {
            porta.fechar();
        }
    }

    public void travarTodasAsPortas() {
        for (Porta porta : portas) {
            porta.travar();
        }
    }

    public void destravarTodasAsPortas() {
        for (Porta porta : portas) {
            porta.destravar();
        }
    }
}
