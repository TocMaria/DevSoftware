package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//import Cadastros.Cliente;
import Interfaces.InterfaceSerializacaoGenerica;

public class EntidadeGenerica implements InterfaceSerializacaoGenerica {

	@Override
	@SuppressWarnings("resource")
	public <E> boolean salvarLista(List<E> lstEntidades, String strArquivo) {
		try {
			File arquivo = new File(strArquivo);
			FileOutputStream fos = new FileOutputStream(arquivo);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lstEntidades);
			System.out.println("A entidade foi salva!!!");
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings({ "resource", "unchecked" })
	@Override
	public <E extends Comparable<E>> List<E> lerLista(String strArquivo) {
		try {
			File arquivo = new File(strArquivo);
			FileInputStream fis = new FileInputStream(arquivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<E> lst = (List<E>)ois.readObject();
			return lst;
		} catch (FileNotFoundException e) {
			criarListaVazia(strArquivo);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public <E> boolean salvarEntidade(E elemento, String strArquivo) {

		List<E> lstGenerica = (List<E>) lerLista(strArquivo);
		lstGenerica.add(elemento);
		return salvarLista(lstGenerica, strArquivo);

	}

	@Override
	@SuppressWarnings("resource")
	public <E> List<E> criarListaVazia(String strArquivo) {
		try {
			File arquivo = new File(strArquivo);
			FileOutputStream fos = new FileOutputStream(arquivo);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			List<E> lst = new ArrayList<E>();
			oos.writeObject(lst);
			System.out.printf("lista vazia persistida");
			return (List<E>) lerLista(strArquivo);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	
	}

	public <E> void imprimirLista (String strArquivo) {
		List <E> lista = (List<E>) lerLista (strArquivo);
		for (E obj: lista) {
			System.out.println(obj);
		}
	}
}
