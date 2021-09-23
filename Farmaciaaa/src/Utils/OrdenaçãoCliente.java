package Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Cadastros.Cliente;

public class OrdenaçãoCliente {

	public static void main(String a[]) {

//		List<Cliente> lst = new ArrayList<>();
//		Cliente c1= new Cliente ("Maria", "864646", "8998444", "abacate", "Jujuba");
//		lst.add(c1);
//		Cliente c2= new Cliente ("Adriana", "864646", "8998444", "abacate", "Jujuba");
//		lst.add(c2);
//		Cliente c3= new Cliente ("Paula", "864646", "8998444", "abacate", "Jujuba");
//		lst.add(c3);
//
//		Collections.sort(lst);
//		
//		for (Cliente c : lst) {
//			System.out.println(c);
//		}
		// --não vai funcionar pq ele não sabe por onde ordenar, é preciso primeiro
		// comparar eles.
		// Fazer metodo de comparação lá na classe cliente.

		List<Cliente> lst = new ArrayList<>();
		Cliente c1 = new Cliente("Maria", "864646", "8998444", "abacate", "Jujuba");
		lst.add(c1);
		Cliente c2 = new Cliente("Adriana", "864646", "8998444", "abacate", "Jujuba");
		lst.add(c2);
		Cliente c3 = new Cliente("Paula", "864646", "8998444", "abacate", "Jujuba");
		lst.add(c3);

		// Collections.sort(lst);
//							'- objeto cliente deve implementar interface comparable
		// System.out.println(Collections.max(lst));

		Collections.sort(lst);

		for (Cliente i : lst) {
			System.out.println(i);
		}

	}
}
