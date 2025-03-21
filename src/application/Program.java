package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File arquivoCSV = new File("C:\\test.csv");
		
		try {
			
			String linhasDoArquivo = null;
			
			//Scanner responsável por ler o arquivo
			Scanner leitor = new Scanner(arquivoCSV);	
			
			//Ignorar primeira linha
			leitor.nextLine();
			
			//Percorrer cada linha do arquivo
			while(leitor.hasNext()) {
				
			//A cada próxima linha que o leitor encontrar, ele irá jogar na String
			linhasDoArquivo = leitor.nextLine();
			
			//Cada vez que o programa encontrar uma vírgula, ele cria uma posição no vetor
			String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
			
			
			System.out.println(valoresEntreVirgulas[0] + " - " + valoresEntreVirgulas[1]);
			}
			
		}
		catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
