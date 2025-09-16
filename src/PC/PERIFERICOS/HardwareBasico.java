package PC.PERIFERICOS;
public class HardwareBasico {

    private String nome;
    private float capacidade;
    private static int quantidade_de_componentes = 0;

    public HardwareBasico(String nome, float capacidade)
    {
        this.nome = nome;
        this.capacidade = capacidade;
        quantidade_de_componentes++;
    }
    public HardwareBasico()
    {
    }
    
    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }
    public static int getQuantidade_de_componentes() {
        return quantidade_de_componentes;
    }
    
}
