package Testes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivo {

	public static void main(String[] args) throws IOException {

		File f = new File("/Users/cassioseffrin/teste.txt");
		FileInputStream fis = new FileInputStream(f);
		Scanner scan = new Scanner(fis);
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		fis.close();
		scan.close();
	}

}
