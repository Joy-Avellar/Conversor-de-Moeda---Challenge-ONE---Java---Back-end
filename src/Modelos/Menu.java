package Modelos;

import java.util.Scanner;

public class Menu {

    private Scanner leitura;

    public Menu() {
        this.leitura = new Scanner(System.in);
    }

    public void exibirMenu() {

        System.out.println("""
                +****************************************************+
                |                CONVERSOR DE MOEDAS                 |
                +****************************************************+
                |                                                    |
                | 1 - Peso Argentino(ARS) para Dólar(USD)            |
                | 2 - Peso Argentino(ARS) para Real Brasileiro(BRL). |
                | 3 - Peso chileno(CLP) para Dólar(USD).             |
                | 4 - Peso chileno(CLP) para Real(BRL).              |
                | 5 - Real brasileiro(BRL) para Dólar(USD)           |
                | 6 - Real brasileiro(BRL) para peso Chileno(CLP)    |
                | 7 - Peso colombiano(COP) para Dólar(USD).          |
                | 8 - Peso boliviano(BOB) para Dólar(USD).           |
                | 9 - Dolar AMericano (USD) para Real (BRL)          |
                | 10 - SAIR                                          |
                +*************************************************+***
                
                Selecione uma opção:
                """);
        }

    public int lerOpcao() {
        return leitura.nextInt();
    }

    public double lerValor() {
        System.out.print("Digite o valor a ser convertido (separe a casa decimal por virgula): ");
        return leitura.nextDouble();
    }

    public void fecharScanner() {
        leitura.close();
    }
}
