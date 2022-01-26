package com.day_5.Q4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BiggestDouble {
	public static void main(String args[])
	{
		Double largestValue=0.0;
		try(BufferedReader br=new BufferedReader(new FileReader("data.txt")))
		{
			String line=null;
			while((line=br.readLine())!=null)
			{
				double val=Double.parseDouble(line);
				if(largestValue<val) {
					largestValue=val;
				}
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("The maximum among the values given in data.txt file is: "+largestValue);
	}
}
