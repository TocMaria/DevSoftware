package Cadastros;

import java.io.Serializable;

public class Farmaceutico extends Funcionario implements Serializable, Comparable<Object>{

	public Farmaceutico(String[] a) {
		super(a);
		// TODO Auto-generated constructor stub
	}


	private static final long serialVersionUID = 4L;
	private String registroAnvisa;

	public String getRegistroAnvisa() {
		return registroAnvisa;
	}

	public void setRegistroAnvisa(String registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	

@Override
public String toString() {
	return super.toString()+ ";"+ this.registroAnvisa;
}

public int compareTo(Object o) {
	Farmaceutico e = (Farmaceutico) o;		
	return this.getNome().compareTo(e.getNome());			
}

}
