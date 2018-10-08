import java.util.ArrayList;

public class SubCapitol {

    private String titlu;

    SubCapitol(String titlu){
        this.titlu = titlu;
    }

    ArrayList<Imagine> imagini = new ArrayList<>();
    ArrayList<Text> texte = new ArrayList<>();

    void addImagine(Imagine imagine){
        this.imagini.add(imagine);
    }

    void addText(Text text){
        this.texte.add(text);
    }

    @Override
    public String toString() {
        return "SubCapitol{" +
                "titlu='" + titlu + '\'' +
                ", imagini=" + imagini +
                ", texte=" + texte +
                '}';
    }
}