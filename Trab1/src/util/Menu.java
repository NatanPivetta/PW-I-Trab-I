package util;

import dao.SocioDAO;
import locacoes.Locacao;
import pessoas.Pessoa;
import pessoas.Socio;

import java.awt.*;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;

import javax.swing.*;

public class Menu {
	
	private static TreeSet<Socio> socios = new TreeSet<>();
	public static int montaMenu() {
		String str = "";
		for (OpcoesMenu opcaoMenu : OpcoesMenu.values())
			str += opcaoMenu.getOpcao() + "\n";
		return Integer.parseInt(JOptionPane.showInputDialog(str));
	}

	public static void cadastraLocacao() throws SQLException, ParseException {
		Locacao loc = Panel.cadastraLocacao();

	}

	public static boolean cadastraSocio() throws SQLException {
		String socioNome = Panel.cadastraSocio();
		if (socioNome != null) {
			if (SocioDAO.getSocio(socioNome) != null) {
				socios.add(SocioDAO.getSocio(socioNome));
				System.out.println("Sócio cadastrado");
				Pessoa.setTotal();
			}

			else
				System.out.println("Sócio não cadastrado");

		}

		return false;

	}
	
	public static void pesqLocacao () {
		Locacao loc = Panel.pesqLocacao();
	}
	
	public String listaSocios() {
		String s = "";
		for (Socio socio : socios) {
			s += socio.toString();
		}
		return s;
	}
}