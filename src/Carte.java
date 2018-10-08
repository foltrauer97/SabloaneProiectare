import java.util.ArrayList;

public class Carte {

    private String titlu;
    ArrayList<Autor> autori = new ArrayList<>();
    ArrayList<Capitol> capitole = new ArrayList<>();
    Cuprins cuprins;

    Carte(String titlu){
        this.titlu = titlu;
    }


    void addCapitol(Capitol capitol){
        this.capitole.add(capitol);

    }

    void addAutor(Autor autor){
        this.autori.add(autor);
    }

    void addCuprins(Cuprins cuprins){
        this.cuprins = cuprins;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autori=" + autori +
                ", capitole=" + capitole +
                ", cuprins=" + cuprins +
                '}';
    }
}