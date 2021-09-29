package ui;

import java.util.Scanner;

import Cadastros.Cliente;
import Cadastros.Funcionario;
import Utils.EntidadeGenerica;
import DAO.ClienteDAO;

public class Principal {
	
	private static ClienteDAO clienteDAO = new ClienteDAO();


	public static void main(String array[]) {
		montaTelaPrincipal();
	}

	private static void montaTelaPrincipal() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("\t SISTEMA FARMACEUTICO\n");
			System.out.println("1. CADASTROS");
			System.out.println("2. ESTOQUE");
			System.out.println("3. RELATORIOS");
			System.out.println("4. AJUDA");
			System.out.println("5. SAIR\n");		
			System.out.printf("Digite uma das opções acima: ");
			Integer op = s.nextInt();
			irTela(op);
			//s.close();
		}
	}

	private static void irTela(Integer op) {
		switch (op) {
		case 1:
			irMenuCadastro();
			break;

		case 2:
			irMenuEstoque();
			break;
			
		case 3:
			irMenuRelatorio();
			break;
			
			

		default:
			System.out.printf("Entrada inválida!");
			montaTelaPrincipal();
		}

	}

	private static void irMenuEstoque() {
		// TODO Auto-generated method stub
		
	}

	private static void irMenuCadastro() {

		System.out.println("\t CADASTROS\n");
		System.out.println("1. CLIENTE");
		System.out.println("2. FUNCIONARIO");
		System.out.println("3. FARMACEUTICO ");
		System.out.println("4. PRODUTOS");
		System.out.println("5. VOLTAR\n");
		System.out.printf("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();

		switch (op) {
		case 1:
			cadastroCliente();
			break;

		case 2:
			cadastroFuncionario();
			break;

		default:
			System.out.printf("Entrada inválida!");
			montaTelaPrincipal();

		}

		s.close();
	}

	private static void cadastroCliente() {
		System.out.println("\t Cliente\n");
		System.out.println("1.Inserir");
		System.out.println("2. Alterar");
		System.out.println("3. Voltar");
		
		System.out.printf("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();

		switch (op) {
		case 1:
			inserirCliente();
			break;

		case 2:
			alterarCLiente();
			break;
			
		case 3:
			irMenuCadastro();
			break;

		default:
			System.out.printf("Entrada inválida!");
			montaTelaPrincipal();
	}
	}

	
	private static void irMenuRelatorio() {

		System.out.println("\t RELATORIOS\n");
		System.out.println("1. CLIENTE");
		System.out.println("2. FUNCIONARIO");
		System.out.println("3. FARMACEUTICO ");
		System.out.println("4. PRODUTOS");
		System.out.println("5. VOLTAR\n");
		System.out.printf("Digite uma das opções acima: ");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();

		switch (op) {
		case 1:
			relatorioCliente();
			break;

		case 2:
			relatorioFuncionario();
			break;

		default:
			System.out.printf("Entrada inválida!");
			montaTelaPrincipal();
		}
		
		s.close();
	}

	private static void relatorioFuncionario() {
		System.out.println("IMPRIMINDO FUNCIONARIO \n");

		EntidadeGenerica e = new EntidadeGenerica();
		e.imprimirLista(Funcionario.ARQUIVO_SERIALIZACAO);
		
		System.out.println("\n Digite uma opcao \n 1 : Menu \t 2 : Relatorios");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		if (op == 1) {
			montaTelaPrincipal();
		} else if (op == 2) {
			irMenuRelatorio();
		}
		s.close();
	}

	private static void relatorioCliente() {
		System.out.println("IMPRIMINDO CLIENTE \n");

		EntidadeGenerica e = new EntidadeGenerica();
		e.imprimirLista(Cliente.ARQUIVO_SERIAL);

		System.out.println("\n Digite uma opcao \n 1 : Menu \t 2 : Relatorios");
		Scanner s = new Scanner(System.in);
		Integer op = s.nextInt();
		if (op == 1) {
			montaTelaPrincipal();
		} else if (op == 2) {
			irMenuRelatorio();
		}
		s.close();
	}

	private static void inserirCliente() {
		Scanner s = new Scanner(System.in);
		Cliente cliente = new Cliente();
		System.out.println("\t CADASTRANDO CLIENTE \n");

		System.out.println("Nome: ");
		cliente.setNome(s.nextLine());
		System.out.println("CPF: ");
		cliente.setCpf(s.nextLine());
		System.out.println("RG: ");
		cliente.setRg(s.nextLine());
		System.out.println("Telefone: ");
		cliente.setTelefone(s.nextLine());
		System.out.println("Endereco: ");
		cliente.setEndereco(s.nextLine());

		EntidadeGenerica entidade = new EntidadeGenerica();
		entidade.salvarEntidade(cliente, Cliente.ARQUIVO_SERIAL);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s.close();

		montaTelaPrincipal();

	}
	private static void alterarCLiente() {
		Scanner s = new Scanner(System.in);
		System.out.println("\t ALTERAÇÃO DE CLIENTE \n");

		System.out.println("Informe id do cliente: ");
		int id = s.nextInt();
		Cliente cliente = clienteDAO.buscar(id);
	

		System.out.println("Nome: ");
		cliente.setNome(s.nextLine());
		System.out.println("CPF: ");
		cliente.setCpf(s.nextLine());
		System.out.println("RG: ");
		cliente.setRg(s.nextLine());
		System.out.println("Telefone: ");
		cliente.setTelefone(s.nextLine());
		System.out.println("Endereco: ");
		cliente.setEndereco(s.nextLine());	
		s.close();
	}


	private static void cadastroFuncionario() {
		Scanner s = new Scanner(System.in);
		Funcionario func = new Funcionario();
		System.out.println("\t CADASTRANDO FUNCIONARIO\n");

		System.out.println("Nome: ");
		func.setNome(s.nextLine());
		System.out.println("CPF: ");
		func.setCpf(s.nextLine());
		System.out.println("RG: ");
		func.setRg(s.nextLine());
		System.out.println("Endereco: ");
		func.setEndereco(s.nextLine());
		System.out.println("PIS: ");
		func.setPis(s.nextLine());
		System.out.println("PASEP: ");
		func.setPasep(s.nextLine());
		System.out.println("Carteira de Trabalho: ");
		func.setCarteiraTrabalho(s.nextLine());
		System.out.println("Salário: ");
		func.setSalario(s.nextDouble());

		EntidadeGenerica entidade = new EntidadeGenerica();
		entidade.salvarEntidade(func, Funcionario.ARQUIVO_SERIALIZACAO);
		s.close();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		montaTelaPrincipal();

	}
}
