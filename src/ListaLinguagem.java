import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListaLinguagem {
    public static void main(String[] args) {
        Set<linguas> linguagens = new HashSet<>();
        linguagens.add(new linguas("Python",1989,"IDLE"));
        linguagens.add(new linguas("Java", 1991, "VSCode"));
        linguagens.add(new linguas("JavaScript", 1995, "IntelliJ"));

        System.out.println("Ordem de Inserção:");
        for (linguas linguagem : linguagens) {
            System.out.println(linguagem);
        }
        System.out.println();

        System.out.println("Ordem Natural: Nome");
        Set<linguas> linguagens2 = new TreeSet<>(linguagens);
        for (linguas linguagem : linguagens2) {
            System.out.println(linguagem);
        }
        System.out.println();

        System.out.println("Ordem IDE:");
        Set<linguas> linguagens3 = new TreeSet<>(new ComparatorIde());
        linguagens3.addAll(linguagens);
        for (linguas linguagem : linguagens3) {
            System.out.println(linguagem);
        }

         System.out.println("Ordem de Criação e Nome:");
        List<linguas> linguagens4 = new ArrayList<>(linguagens);
        linguagens4.sort(Comparator.comparingInt(linguas::getAno).thenComparing(linguas::getNome));
        for (linguas linguagem : linguagens4) {
            System.out.println(linguagem);
        }
        System.out.println();

        System.out.println("Ordem Nome, Ano de Criação e IDE:");
        List<linguas> linguagens5 = new ArrayList<>(linguagens);
        linguagens5.sort(Comparator.comparing(linguas::getNome).thenComparingInt(linguas::getAno).thenComparing(linguas::getIDE));
        for (linguas linguagem : linguagens5) {
            System.out.println(linguagem);
        }
    }
}