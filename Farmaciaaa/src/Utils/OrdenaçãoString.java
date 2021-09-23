package Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaçãoString {

	public static void main(String a[]) {

		List<String> lst = new ArrayList<>();
		lst.add("Maria");
		lst.add("Joana");
		lst.add("Paula");
		lst.add("Beatriz");
		lst.add("Alessandra");

		Collections.sort(lst);
		for (String i : lst) {
			System.out.println(i);
		}
	}
}
