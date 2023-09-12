package pessoas;

public abstract class Pessoa{
    private String nome;
    private Date dataNascimento;
    private static int total;


    @Override
    public String toString(){
        String s = "";

        return s;
    }

    public int getTotal(){
        return total;
    }


}