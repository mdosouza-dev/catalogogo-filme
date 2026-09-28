package br.com.alura.Screenmatch.principal;

import br.com.alura.Screenmatch.modelos.Episodio;
import br.com.alura.Screenmatch.modelos.Filme;
import br.com.alura.Screenmatch.modelos.Serie;
import br.com.alura.Screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.Screenmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);


        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDois = new Filme("Avatar", 2013);
        filmeDois.setDuracaoEmMinutos(120);
        filmeDois.avalia(10);

        Filme filmeTres = new Filme("dogville", 2003);
        filmeTres.setDuracaoEmMinutos(120);
        filmeTres.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDois);
        listaDeFilmes.add(meuFilme);

        System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
        System.out.println("Lista de filmes: " + listaDeFilmes);

        System.out.println(listaDeFilmes);


        

    }
}
