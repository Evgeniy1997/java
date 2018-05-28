package by.gsu.pms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serelizator {
	
	public static final String FILENAME = "src/Stock.txt";

	public static void serialize(Stock obj[]){
		
		FileOutputStream outFile;

		try {
			outFile = new FileOutputStream(FILENAME);
			ObjectOutputStream out = new ObjectOutputStream(outFile);
			out.writeObject(obj);
			out.flush();
			out.close();
			outFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Stock[] deSerialize(){

		Stock out[]= null;
		FileInputStream inFile;

		try {
			inFile = new FileInputStream(FILENAME);
			ObjectInputStream in = new ObjectInputStream(inFile);
			out = (Stock[])in.readObject();
			in.close();
			inFile.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return out;
	}
}
