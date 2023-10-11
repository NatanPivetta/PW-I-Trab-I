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

    public Date getDataNascimento() {
        return dataNascimento;
    }


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public static void setTotal(int total) {
		Pessoa.total = total;
	}
    
    
}