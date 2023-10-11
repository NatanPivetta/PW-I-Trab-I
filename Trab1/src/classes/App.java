package classes;

import dao.SocioDAO;
import pessoas.Socio;
import util.Menu;
public class App {
    public static void main(String[] args) throws Exception {
        
        int op = Menu.montaMenu();
        switch (op){
            case 1:
                Menu.cadastraLocacao();
                System.out.println("Cadastrando Locação");
                break;
            case 2:
                System.out.println("Pesquisando Locação");
                break;
            case 3:
                System.out.println("Cadastrando Sócio");
                Menu.cadastraSocio();
            break;
            case 4:
                System.out.println("Pesquisando Sócio");
                break;
            case 5:
                System.out.println("Listando Locações");
                break;
            case 6:
                System.out.println("Listando Sócios");
                break;
            case 7:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
