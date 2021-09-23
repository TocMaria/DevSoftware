package ui;

import java.util.Date;
import java.util.Scanner;

import Azul.Produto;
import Cadastros.Cliente;
import Utils.EntidadeGenerica;

public class AzulPrincipal {
//eu quero q o cliente faça um pedido
//	q tenha ou não uma receita
//	esse pedido pede por um :itemPedido
//							que tem um Produto
//							que se encaixa em uma categoria
	public static void main(String[] args) {
		montaTelaPrincipal();
			
	}

	private static void montaTelaPrincipal() {
		Scanner s = new Scanner(System.in);
		System.out.println("\t SISTEMA FARMACEUTICO\n");
		System.out.println("1. NOVO PEDIDO");
		System.out.println("2. RELATORIOS");
		System.out.println("3. AJUDA");
		System.out.println("4. SAIR\n");		
		System.out.printf("Digite uma das opções acima: ");
		Integer op = s.nextInt();
		irTela(op);
	}

	private static void irTela(Integer op) {switch (op) {
	case 1:
		irMenuPedido();
		break;

	case 2:
		irMenuRelatorio();
		break;
		
	case 3:
		System.out.println("Ligue: 000800");
		break;
		
		

	default:
		System.out.printf("Entrada inválida!");
		montaTelaPrincipal();
	}

	
							
	}

	private static void irMenuRelatorio() {
		// TODO Auto-generated method stub
		
	}

	private static void irMenuPedido() {
		Scanner s = new Scanner(System.in);
		Produto produto = new Produto();
		Date data= new Date();
		System.out.println("\t CADASTRANDO PEDIDO \n");
		System.out.println("Data:"+ data);	
		System.out.println("Código de Barra: ");
		produto.setCodBarra(s.nextLine());
		System.out.println("Lote: ");
		produto.setLote(s.nextLine());
		System.out.println("Data fabricação (AA/MM/DD): ");
		produto.setDataFabricacao(s.nextLine());
		System.out.println("Data validade (AA/MM/DD): ");
		produto.setDataValidade(s.nextLine());
		System.out.println("Valor: ");
		produto.setValor(s.nextFloat());
		System.out.println("Idade Minima: ");
		produto.setiMin(s.nextFloat());
		System.out.println("Idade Maxima: ");
		produto.setiMax(s.nextFloat());

		EntidadeGenerica entidade = new EntidadeGenerica();
		entidade.salvarEntidade(produto, Produto.ARQUIVO_SERIAL);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s.close();

		montaTelaPrincipal();
		
	}

}
