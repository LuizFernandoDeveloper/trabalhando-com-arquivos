package aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String path = "/home/luiz/software/nelio/trabalhando-com-arquivos/in.txt";

		String[] lines = new String[] {
			"Good Morning",
			"Good Afternoon",
			"Good ninghit"
		};

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line: lines){
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}