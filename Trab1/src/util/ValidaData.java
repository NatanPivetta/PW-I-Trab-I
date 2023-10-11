package util;
import java.util.Date;

public interface ValidaData{
    public default int validar(Date fim, Date dataDevolucao){
        int em_dia = 1;

        return em_dia;

    }
}