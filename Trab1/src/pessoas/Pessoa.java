package pessoas;
import java.util.Date;

public abstract class Pessoa{
    private String nome;
    private Date dataNascimento;
    private static int total;

    public Pessoa(String nome, Date nascimento) {
        this.nome = nome;
        this.dataNascimento = nascimento;
    }


    @Override
    public String toString(){
        String s = "";

        return s;
    }

    public int getTotal(){
        return total;
    }

    public String getNome() {
        return nome;
    }

    public long getDataNascimento() {
        return dataNascimento.getTime();
    }
}