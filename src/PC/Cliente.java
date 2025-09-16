package PC;
public class Cliente {
private String nome;
private String cpf;

private Computador[] computador;

private float conta = 1;

public Cliente (String nome, String cpf)
{
    this.nome = nome;
    this.cpf = cpf;
}
public float calculaTotalCompra()
{
    for (int i = 0; i < computador.length; i++) 
        {
            if (computador[i] != null)
                conta += computador[i].getPreco();

        }
        return conta;

}
public void setComputador(Computador[] computador) {
    this.computador = computador;
}

}
