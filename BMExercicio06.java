public class Equipamento {
    private String nome;
    private int preco;

    public Equipamento(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}

public class Computador extends Equipamento {
    private String processador;
    private int ram;

    public Computador(String nome, int preco, String processador, int ram) {
        // chamando o construtor da superclasse Equipamento
        // passando como parâmetros o nome e o preço informados no construtor da subclasse
        super(nome, preco);
      
        this.processador = processador;
        this.ram = ram;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
