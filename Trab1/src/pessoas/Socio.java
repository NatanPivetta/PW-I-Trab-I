package pessoas;

import java.util.Date;
import java.util.TreeSet;

public class Socio extends Pessoa{
    private String endereco;
    private String email;
    private TreeSet<Dependente> dependentes = new TreeSet<>();


    
    
    public Socio(String _nome, String endereco, String email, Date _nascimento){
        super(_nome, _nascimento);
        this.endereco = endereco;
        this.email = email;
    }
    @Override
    public String toString(){
        String s = "";

        return s;
    }

    


    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    
    

}
