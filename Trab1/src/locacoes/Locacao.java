package locacoes;
import pessoas.Socio;
import util.Situacao;
import util.ValidaData;

public final class Locacao implements ValidaData{
    private Date dataRetirada;
    private Date dataDevolucao;
    private double valor;
    private String titulo;
    private Situacao situacao;

    private Socio socio;
}