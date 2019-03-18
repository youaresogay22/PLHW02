package reclnklst;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test{
public static void main(String[] args) throws FileNotFoundException { 
	
	RecursionLinkedList list = new RecursionLinkedList();  
	RecursionLinkedList list2 = new RecursionLinkedList();
	
	
	FileReader fr;  
	try {   
		fr = new FileReader("hw01.txt");    
		BufferedReader br = new BufferedReader(fr);   
		String inputString = br.readLine();   
		for(int i = 0; i < inputString.length(); i++)    
			list.add(inputString.charAt(i));   
		} catch (IOException e) {    
			e.printStackTrace();   
			}   
	
	FileReader fr2;  
	try {   
		fr2 = new FileReader("hw02.txt");    
		BufferedReader br2 = new BufferedReader(fr2);   
		String inputString = br2.readLine();   
		for(int i = 0; i < inputString.length(); i++)    
			list2.add(inputString.charAt(i));   
		} catch (IOException e) {    
			e.printStackTrace();   
			} 
	
	System.out.println("list tostring:"+list.toString());   
	System. out .println("list2 tostring:"+(list2)); 
	
	System.out.println("-----------------------------------------------");   
	
	System.out.println("list length:"+list.size()); 
	System.out.println("list2 length:"+list2.size()); 
	
	System.out.println("-----------------------------------------------");  
	
	list.reverse();
	System.out.println("list reversed:"+list.toString());  
	System.out.println("list2:"+list2.toString()); 
	
	System.out.println(""); 
	
	list2.reverse();
	System.out.println("list2 reversed:"+list2.toString());
	System.out.println("list :"+list.toString()); 
	list.reverse();
	list2.reverse();
	System.out.println("");
	System.out.println("가독성 향상을 위해 list와 list2를 다시 reverse()하였음");
	System.out.println("");
	System.out.println("list tostring:"+list.toString());   
	System. out .println("list2 tostring:"+(list2)); 
	System.out.println("-----------------------------------------------");  
	
	list.add(3, 'b');  
	System. out .println("added b in int=3, list:"+list.toString());
	System.out.println("added b in int=3, list length:"+list.size());
	
	System.out.println("-----------------------------------------------");  
	
	list.remove(3);
	System. out .println("removed element in int=3, list:"+list.toString());
	System.out.println("removed element in int=3, list length:"+list.size());
	
	System.out.println("-----------------------------------------------");  
	
	list.addAll(list2);
	System.out.println("added list+list2, list tostring:"+list.toString());
	System.out.println("added list+list2, list2 tostring:"+list2.toString());
	
	System.out.println("-----------------------------------------------");  
	
	
	System.out.println("list tostring:"+list.toString());
	System. out .println("list2 tostring:"+(list2));
	System.out.println(""); 
	list.reverse();
	System.out.println("list reversed:"+list.toString());  
	System.out.println("list2:"+list2.toString()); 

	list2.reverse();
	System.out.println("list2 reversed:"+list2.toString());
	System.out.println("list :"+list.toString()); 
	
	// 등등 구현한 기능 추가해서 사용   
	}
}