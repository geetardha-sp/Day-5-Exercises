package com.sechpoint;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Me\\Downloads");

		if (file.exists() && file.isDirectory())
			System.out.println("The Directory exists.");
		else {
			if (file.exists())
				System.out.println("The File exists.");
			else
				System.out.println("The Directory or File does not exist.\n");
		}
	}
}
