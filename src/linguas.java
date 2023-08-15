
public class linguas implements Comparable<linguas>{
    private String nome;
    private int ano;
    private String IDE;

    public linguas (String nome, int ano, String IDE) {
        this.nome = nome;
        this.ano = ano;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return "linguas [nome=" + nome + ", ano=" + ano + ", IDE=" + IDE + "]";
    }

    @Override
    public int compareTo(linguas outraLinguagem) {
        return this.nome.compareTo(outraLinguagem.nome);
    }
}