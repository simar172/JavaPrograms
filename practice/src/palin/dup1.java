package palin;

import java.util.Scanner;

public class dup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String string =s.nextLine() ; 
		
        
          
        //Converts the string into lowercase  
        string = string.toLowerCase();  
          
        //Split the string into words using built-in function  
        String words[] = string.split(" ");  
          
         
        for(int i = 0; i < words.length; i++) {  
            
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                     String c= string.replaceAll(words[j],"");
                     System.out.println(c);
                    //Set words[j] to 0 to avoid printing visited word  
                      
                }}}}} 
             
              
            
    


