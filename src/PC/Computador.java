package PC;

import PC.PERIFERICOS.HardwareBasico;
import PC.PERIFERICOS.MemoriaUSB;
import PC.PERIFERICOS.SistemaOperacional;

public class Computador {

    private String marca;
    private float preco;
    
    private HardwareBasico[] hardware;
    private SistemaOperacional sistemaOp;
    
    private MemoriaUSB memoria;

    private  static int quantidade_de_promos = 0;// identifica a quantidade de promos ja criadas

    public Computador(String marca, float preco, HardwareBasico[] hardware, String nome_sistema,int bits_sistema)
    {
        this.marca = marca;
        this.preco = preco;

        sistemaOp = new SistemaOperacional(nome_sistema,bits_sistema);

           if (hardware != null) 
           {
            this.hardware = new HardwareBasico[hardware.length];

                for (int i = 0; i < hardware.length; i++) 
                {
                    this.hardware[i] = hardware[i];
                }
            
            }
            quantidade_de_promos++;
    }

    
    public void mostraPCCONFIG()
    {
        System.out.println("A config desse pc é: ");
        System.out.println("Marca: "+ this.marca);
        System.out.println("Valor: "+ this.preco);

        for (int i = 0; i < hardware.length; i++) 
        {
            if (hardware[i] == null)
                break;
            System.out.print("Hardware: "+ hardware[i].getNome());
            System.out.println(" "+ hardware[i].getCapacidade());

        }

        System.out.println();
    }
    // public void addMemoriaUSB()
    
    
    public void setMemoria(MemoriaUSB memoria) {
        this.memoria = memoria;
    }


    public static int getQuantidade_de_promos() {
        return quantidade_de_promos;
    }


    public float getPreco() {
        return preco;
    }




}
