package Interfaces;

import java.util.List;

public interface InterfaceSerializacaoGenerica {

	public <E> boolean salvarLista(List<E> lstEntidades, String arquivo);
		
	public <E extends Comparable<E>> List<E> lerLista(String arquivo);

	public <E> List<E> criarListaVazia(String arquivo);

	public <E> boolean salvarEntidade(E elemento, String arquivo);
	
	public <E> void imprimirLista(String strArquivos);
}
