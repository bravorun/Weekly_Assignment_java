package com.day_5.Q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Frequency {
public static void main(String args[]){
	Map<String,Integer> counter=new HashMap<String,Integer>();
	try(BufferedReader read=new BufferedReader(new FileReader("story.txt"));){
		
	String line=null;
	
		while((line=read.readLine())!=null) {
			String tokens[]=line.split(" ");
			for(String token:tokens) {
				token=token.toLowerCase();
				Integer count=counter.get(token);
				if(count==null)
					counter.put(token,1);
				else
					counter.put(token,++count);
				
			}
		}
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}catch (IOException ex) {
		System.out.println(ex.getMessage());
		ex.printStackTrace();
	}
	System.out.println("-------print the map-----------");
	Set<Entry<String, Integer>> entrySet = counter.entrySet();
	
	for(Entry<String, Integer> entry: entrySet) {
		System.out.println(entry.getKey() +" : "+ entry.getValue());
	}
}
}
