public class MarcaPagina {

    private int page;

    public MarcaPagina() {
    }

    public MarcaPagina(int page) {

        this.page = page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void increasePage() {

        this.page++;
    }

    public void showLastPage() {

        System.out.println(this.page - 1);
    }

    public void newBook() {

        this.page = 1;
    }
}
