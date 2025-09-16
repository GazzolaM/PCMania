package PC.PERIFERICOS;
public class MemoriaUSB {
private String nome;
private int capacidade;

public MemoriaUSB(String nome, int capacidade)
{
    this.nome = nome;
    this.capacidade = capacidade;
}
public MemoriaUSB()// pode ou nao ter uma memoria usb
{
}
    public String getNome() {
        return nome;
    }


    public int getCapacidade() {
        return capacidade;
    }



}
