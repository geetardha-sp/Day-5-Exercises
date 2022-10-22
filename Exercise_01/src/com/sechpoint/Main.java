package com.sechpoint;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		PrintWriter writer = new PrintWriter(new File("C:\\Users\\Geetardha Kota\\Downloads\\test.txt"));

		writer.write("Like Java, Spring, Hibernate, Android, PHP etc.");
		writer.flush();
		writer.close();

		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Geetardha Kota\\Downloads\\test.txt"));

		String line;
		while ((line = reader.readLine()) != null) {
		    System.out.println(line);
		}
		reader.close();
	}
}
