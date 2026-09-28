package br.com.alura.Screenmatch.principal;

import br.com.alura.Screenmatch.modelos.Filme;
import br.com.alura.Screenmatch.modelos.Serie;
import br.com.alura.Screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Poderoso Chefão",1970);
        Filme filmeDois = new Filme("Avatar", 2013);
        Filme filmeTres = new Filme("dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDois);
        lista.add(meuFilme);
        lista.add(filmeTres);
        lista.add(lost);

        Filme f1 = filmeDois;

        for(Titulo item: lista){
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2 ){

                System.out.println("Classificação" + filme.getClassificacao());

            }

        }
    }
}
