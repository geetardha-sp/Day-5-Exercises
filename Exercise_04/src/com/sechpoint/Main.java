package com.sechpoint;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Me\\Downloads\\jdk-17_windows-x64_bin.exe");

		if(file.exists()) {
			long fileSizeInBytes = file.length();
			long fileSizeInMB = fileSizeInBytes / (1024 * 1024);
			
			System.out.println(fileSizeInMB + " MB");
		}
		else
			System.out.println("Given file doesn't exist!");
	}
}
