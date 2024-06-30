package Principal;

import Modelos.Conversor;
import Modelos.Menu;
import Modelos.Moedas;

public class Principal {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Menu menuPrincipal = new Menu();
        menuPrincipal.exibirMenu();

        int opcao = menuPrincipal.lerOpcao();


        while (opcao != 10) {

            try {


                double valor = menuPrincipal.lerValor();

                Moedas resultado = null;

                switch (opcao) {
                    case 1:
                        resultado = conversor.ConvertendoMoedas("ARS", "USD", valor);
                        break;
                    case 2:
                        resultado = conversor.ConvertendoMoedas("ARS", "BRL", valor);
                        break;
                    case 3:
                        resultado = conversor.ConvertendoMoedas("CLP", "USD", valor);
                        break;
                    case 4:
                        resultado = conversor.ConvertendoMoedas("CLP", "BRL", valor);
                        break;
                    case 5:
                        resultado = conversor.ConvertendoMoedas("BRL", "USD", valor);
                        break;
                    case 6:
                        resultado = conversor.ConvertendoMoedas("BRL", "CLP", valor);
                        break;
                    case 7:
                        resultado = conversor.ConvertendoMoedas("COP", "USD", valor);
                        break;
                    case 8:
                        resultado = conversor.ConvertendoMoedas("BOB", "USD", valor);
                        break;
                    case 9:
                        resultado = conversor.ConvertendoMoedas("USD", "BRL", valor);
                        break;

                    default:
                        System.out.println("Opção não reconhecida!");
                        break;
                }

                System.out.println("Moeda base: " + resultado.base_code());
                System.out.println("Moeda final: " + resultado.target_code());
                System.out.println("Data de atualização: " + resultado.time_last_update_utc());
                System.out.println("Valor a ser convertido: " + valor);
                System.out.println("Taxa de conversão: " + resultado.conversion_rate());
                System.out.println("Valor convertido: " + resultado.conversion_result());

                System.out.println("""
                                    ================================================================
                                    Deseja continuar? Selecione outra opção do Menu ou 10 para Sair.
                                    ================================================================
                                   """);
               opcao = menuPrincipal.lerOpcao();

            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }

        }
        if (opcao == 10) {
            System.out.println(""" 
                                    ****************************************
                                    Obrigada por utilizar nosso conversor!
                                    O programa será encerrado
                                    ***************************************
                                """);
            System.exit(0);
        }


    }
}
