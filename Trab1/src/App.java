import util.Menu;
public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        int op = menu.montaMenu();
        switch (op){
            case 3:
            Menu.cadastraSocio();
        }
    }
}
