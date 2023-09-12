package util;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
public class Menu{
    public static int montaMenu(){
        String str = ""; for(OpcoesMenu opcaoMenu: OpcoesMenu.values()) 
        	    str += opcaoMenu.getOpcao()+"\n"; 
         return Integer.parseInt(JOptionPane.showInputDialog(str));
    }
}