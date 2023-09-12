package util;

public interface ValidaData{
    public default int validar(Data fim, Data dataDevolucao){
        int em_dia = 1;

        return em_dia;

    }
}