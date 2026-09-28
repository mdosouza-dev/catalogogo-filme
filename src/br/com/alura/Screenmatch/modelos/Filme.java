package br.com.alura.Screenmatch.modelos;

import br.com.alura.Screenmatch.calculos.Classificado;

public class Filme extends Titulo implements Classificado {
    private String diretor;

    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {

        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacao() / 2;

    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
