package com.day_4.Q1;

import java.io.*;
import java.io.IOException;

public class FileReading {
	public static void main(String args[]) {
		try {
			File file=new File("temp.txt");
			file.length();
			FileInputStream fileRead=new FileInputStream(file);
			byte fileContent[]=new byte[(int)file.length()];
			fileRead.read(fileContent);
			for(byte b :fileContent)
				System.out.print(b);
			System.out.println();
			for(byte b :fileContent)
				System.out.print((char)b);
			fileRead.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
