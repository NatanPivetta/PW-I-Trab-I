package util;
import dao.SocioDAO;
import pessoas.Socio;

import java.awt.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class Menu{
    public static int montaMenu(){
        String str = ""; for(OpcoesMenu opcaoMenu: OpcoesMenu.values()) 
        	    str += opcaoMenu.getOpcao()+"\n"; 
         return Integer.parseInt(JOptionPane.showInputDialog(str));
    }

    public static void cadastraSocio(){
        String dataNasc = "";
        JTextField Jnome = new JTextField(30);
        Jnome.setPreferredSize(new Dimension(50,20));
        JTextField Jemail = new JTextField(30);
        Jemail.setPreferredSize(new Dimension(50,20));
        JTextField Jendereco = new JTextField(30);
        Jendereco.setPreferredSize(new Dimension(50,20));
        JTextField Jdia = new JTextField(2);
        JTextField Jmes = new JTextField(2);
        JTextField Jano = new JTextField(4);
        JPanel cadastroSocio = new JPanel();

        cadastroSocio.setPreferredSize(new Dimension(350,300) );

        cadastroSocio.add(new JLabel("Nome:"));
        cadastroSocio.add(Jnome);
        cadastroSocio.add(new JLabel("E-mail:"));
        cadastroSocio.add(Jemail);
        cadastroSocio.add(new JLabel("Endereço:"));
        cadastroSocio.add(Jendereco);
        cadastroSocio.add(new JLabel("Data de Nascimento:"));
        cadastroSocio.add(Jdia);
        cadastroSocio.add(Jmes);
        cadastroSocio.add(Jano);

        int panel = JOptionPane.showConfirmDialog(null, cadastroSocio, "Cadastro Sócio",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        String nome = Jnome.getText();
        String email = Jemail.getText();
        String endereco = Jendereco.getText();
        dataNasc += Jdia.getText()+"/"+Jmes.getText()+"/"+Jano.getText();

        Date df = new Date(dataNasc);
        Timestamp nascimento = new Timestamp(df.getTime());


       SocioDAO.inserirSocio(new Socio(nome, endereco, email, nascimento));
    }
}