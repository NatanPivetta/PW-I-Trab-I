package pessoas;

import java.util.TreeSet;

public class Socio extends Pessoa{
    private String endereco;
    private String email;
    private TreeSet<Dependente> dependentes = new TreeSet<>();
    
    @Override
    public String toString(){
        String s = "";

        return s;
    }
}
