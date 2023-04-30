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
}
