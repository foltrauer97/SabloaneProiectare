
public class Main {

    public static void main(String[] args){
        Carte c1 = new Carte("Dune");
        c1.addCapitol(new Capitol("Invazia"));
        c1.addAutor(new Autor("Frank Herbert"));
        c1.capitole.get(0).addSubCapitol(new SubCapitol("Part I"));
        c1.capitole.get(0).addSubCapitol(new SubCapitol("Part II"));

        System.out.println(c1);
    }
}