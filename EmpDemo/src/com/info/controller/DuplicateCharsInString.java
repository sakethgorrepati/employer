package com.info.controller;

import java.util.*;

import java.util.Map;
import java.util.Set;
 
public class DuplicateCharsInString {
 
    public void findDuplicateChars(String a){
    	
    	String str=a.toLowerCase();
      
    	//str = str.replaceAll("\\s","");
    	
        Map<Character, Integer> dupMap = new TreeMap<Character, Integer>(); 
        char[] chrs = str.toCharArray();
      
                Arrays.toString(chrs);
        
        for(Character ch:chrs){
        
        	 if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        int c= 0;
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println("'"+ch+"' "+dupMap.get(ch));
                c++;
            }
      
        }
        if(c==0){
        	System.out.println("none");
        }
        
    }
     
    public static void main(String a[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDuplicateChars("asdfjhkasdjASJKAHJKSAHJSSKJS#$$$asdhfasdhjfsahjdfhgkjsd");
    }
}