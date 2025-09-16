import PC.Cliente;
import PC.Computador;
import PC.PERIFERICOS.HardwareBasico;
import PC.PERIFERICOS.MemoriaUSB;
import PC.ProcessarPedido;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        MemoriaUSB memoria1 = new MemoriaUSB("Pendrive" , 16);
        MemoriaUSB memoria2 = new MemoriaUSB("Pendrive", 32);
        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo", 1);

        HardwareBasico[] hardware1 = new HardwareBasico[255];
        HardwareBasico hardware_cpu_1 = new HardwareBasico("Pentium Core i3" ,2200);
        HardwareBasico hardware_ram_1 = new HardwareBasico("Memória RAM Gb" ,8);
        HardwareBasico hardware_storage_1 = new HardwareBasico("HD de Gb" ,500);
        hardware1[0] = hardware_cpu_1;
        hardware1[1] = hardware_ram_1;
        hardware1[2] = hardware_storage_1;

        Computador promo1 = new Computador("apple", 2178, hardware1, "macOS Sequoia", 64);
        promo1.setMemoria(memoria1);

        HardwareBasico[] hardware2 = new HardwareBasico[255];
        HardwareBasico hardware_cpu_2 = new HardwareBasico("Pentium Core i5" ,3370);
        HardwareBasico hardware_ram_2 = new HardwareBasico("Memória RAM Gb " ,16);
        HardwareBasico hardware_storage_2 = new HardwareBasico("HD de Tb " ,1);
        hardware2[0] = hardware_cpu_2;
        hardware2[1] = hardware_ram_2;
        hardware2[2] = hardware_storage_2;

        Computador promo2 = new Computador("Samsung", 3414, hardware2, "Windows 8", 64);
        promo2.setMemoria(memoria2);

        HardwareBasico hardware_cpu_3 = new HardwareBasico("Pentium Core i7" ,4500);
        HardwareBasico hardware_ram_3 = new HardwareBasico("Memória RAM Gb " ,32);
        HardwareBasico hardware_storage_3 = new HardwareBasico("HD de Tb" ,2);
        HardwareBasico[] hardware3 = new HardwareBasico[255];
        hardware3[0] = hardware_cpu_3;
        hardware3[1] = hardware_ram_3;
        hardware3[2] = hardware_storage_3;

        Computador promo3 = new Computador("Dell", 7856, hardware3, "Windows 10", 64);
        promo3.setMemoria(memoria3);


        Computador[] pcs = new Computador[promo1.getQuantidade_de_promos()];
        Computador[] pcs_comporados = new Computador[promo1.getQuantidade_de_promos()];

        pcs[0] = promo1;
        pcs[1] = promo2;
        pcs[2] = promo3;


        ProcessarPedido compra = new ProcessarPedido();
        
        Scanner entrada = new Scanner(System.in);
        int dado_atual, dado_antigo;
        int n_promos = promo1.getQuantidade_de_promos();
        String nome_cliente, cpf_cliente;
        
        
        
        
        System.out.println("Bem vindo ao sistema de compras da PCMania!!!");
        System.out.println("Antes de realizar suas compres é nescessario criar o seu cadrastro em nossa loja!");
        
        System.out.print("Por favor digite seu nome: ");//inicio do cadastro do cliente
        nome_cliente = entrada.nextLine();
        System.out.print("e seu CPF: ");
        cpf_cliente = entrada.nextLine();
        Cliente cliente = new Cliente(nome_cliente,cpf_cliente);// fim do cadastro


        System.out.println();
        System.out.println("Atualmente temos um total de " + n_promos + " promocoes");
        while (true) 
        { 
            System.out.println("Qual promo gostaria de ver? ");
            System.out.print("0 para ver seu carrinho ");
            dado_atual = entrada.nextInt();
            if (dado_atual == 0)
            {
                break;
                
            }
            else if(dado_atual < 1 || dado_atual > n_promos)
            {
                System.out.println("Valor incompativel! pora favor digite um valor entre 1 e " + n_promos);
            }
            else
            {
                pcs[dado_atual-1].mostraPCCONFIG();
                dado_antigo = dado_atual;
                System.out.println("Gostaria de comprar essa maquina? (1-SIM 2-NAO)");
                dado_atual = entrada.nextInt();
                if(dado_atual == 1)
                {
                    pcs_comporados[dado_antigo-1] =  pcs[dado_antigo-1];
                    compra.operacao(pcs_comporados);
                   
                }
            }

        }
        cliente.setComputador(pcs_comporados);
        System.out.println("o Valor total da sua compra ficou em: " + cliente.calculaTotalCompra());

       
    }
}
