package Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaçãoInt {
	public static void main(String a[]) {

		List<Integer> lst = new ArrayList<>();
		lst.add(3);
		lst.add(7);
		lst.add(2);
		lst.add(9);
		lst.add(1);

		Collections.sort(lst);
		for (Integer i : lst) {
			System.out.println(i);
		}
	}
}
