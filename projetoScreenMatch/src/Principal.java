import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Epsodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Pense como eles");
        meuFilme.setAnoDeLancamento(2014);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: "+ meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.calcularMedia());


        Serie you = new Serie();

        you.setNome("You");
        you.setAnoDeLancamento(2020);
        you.exibeFichaTecnica();
        you.setTemporadas(5);
        you.setEpsodiosPorTemporada(10);
        you.setMinutosPorEpsodio(50);
        System.out.println("Duração da série: " + you.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(you);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtrar(meuFilme);


        Epsodio epsodio = new Epsodio();

        epsodio.setNumero(1);
        epsodio.setSerie(you);
        epsodio.setTotalVisualizacoes(300);
        filtro.filtrar(epsodio);



    }
}
