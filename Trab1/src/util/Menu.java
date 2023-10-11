package util;

import dao.SocioDAO;
import locacoes.Locacao;
import pessoas.Socio;

import java.awt.*;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class Menu {
	public static int montaMenu() {
		String str = "";
		for (OpcoesMenu opcaoMenu : OpcoesMenu.values())
			str += opcaoMenu.getOpcao() + "\n";
		return Integer.parseInt(JOptionPane.showInputDialog(str));
	}

	public static void cadastraLocacao() throws SQLException, ParseException {
		Locacao loc = Panel.cadastraLocacao();

	}

	public static void cadastraSocio() throws SQLException {
		String socioNome = Panel.cadastraSocio();
		if (socioNome != null) {
			if (SocioDAO.getSocio(socioNome) != null)
				System.out.println("Sócio não cadastrado");
			else
				System.out.println("Sócio cadastrado");
		}

	}
}