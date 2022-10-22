package com.sechpoint;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Me\\Downloads");
        String[] fileList = file.list();
        
        for(String name : fileList){
            System.out.println(name);
        }
	}
}
