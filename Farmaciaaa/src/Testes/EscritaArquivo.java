package Testes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscritaArquivo {

	public static void main(String[] args) throws IOException {
		File f = new File("/Users/cassioseffrin/teste.txt");
		FileOutputStream fos = new FileOutputStream(f, true); //false = sobrescreve, true = edicao
		String texto = "AULA 5";
		fos.write(texto.getBytes());
		fos.close();
	}

}
