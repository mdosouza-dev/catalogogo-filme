package calculos;

import br.com.alura.Screenmatch.modelos.Filme;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificado classificado) {
        if (classificado.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos da rapaziada");
        } else if (classificado.getClassificacao() >= 2) {
            System.out.println("Bem avaliado");
        } else {
            System.out.println("Adicione a lista para verificar depois");
        }
    }
}
