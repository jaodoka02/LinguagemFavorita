import java.util.Comparator;

class ComparatorIde implements Comparator<linguas> {
    @Override
    public int compare(linguas linguagem1, linguas linguagem2) {
        return linguagem1.getIDE().compareTo(linguagem2.getIDE());
    }
}