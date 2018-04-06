package persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import model.Pessoa;

public class PessoaArquivoTextoRepository implements Repository<Pessoa> {
	
	private static final String path = "Caminho do arquivo";

	@Override
	public void salvar(List<Pessoa> pessoas) {
		File file = new File(path);
		long begin = System.currentTimeMillis();
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write("Arquivo gravado em : " + new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date()));
			writer.newLine();
			writer.write("Caminho da gravação: " + path);
			writer.newLine();
			long end = System.currentTimeMillis();
			writer.write("Tempo de gravação: " + (end - begin) + "ms.");
			//Criando o conteúdo do arquivo
			writer.flush();
			//Fechando conexão e escrita do arquivo.
			writer.close();
			System.out.println("Arquivo gravado em: " + path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void atulizar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pessoa> buscar(String specification) {
		// TODO Auto-generated method stub
		return null;
	}

}

//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//public class WriteFiles {
//	private static final String path = "Caminho do arquivo";
//	public static void main(String[] args) throws IOException {
//		File file = new File(path);
//		long begin = System.currentTimeMillis();
//		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//		writer.write("Arquivo gravado em : " + new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date()));
//		writer.newLine();
//		writer.write("Caminho da gravação: " + path);
//		writer.newLine();
//		long end = System.currentTimeMillis();
//		writer.write("Tempo de gravação: " + (end - begin) + "ms.");
//		//Criando o conteúdo do arquivo
//		writer.flush();
//		//Fechando conexão e escrita do arquivo.
//		writer.close();
//		System.out.println("Arquivo gravado em: " + path);
//	}
//}