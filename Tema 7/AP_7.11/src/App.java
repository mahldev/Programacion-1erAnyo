public class App {

    public static void main(String[] args) {

        MarcaPagina marcaPagina = new MarcaPagina(10);

        marcaPagina.showLastPage();
        marcaPagina.increasePage();
        marcaPagina.showLastPage();
    }
}
