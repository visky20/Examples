package com.core.hackthon.ola;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OlaQ2 {
	
	private static final Scanner scan =new Scanner(System.in); 
	public static void main(String[] args) {
        //String filename;
        //filename = scan.nextLine();
		try{
			   FileInputStream fstream = new FileInputStream("/home/skonduru/Desktop/mylog.log");
			   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			   String strLine;
			   HashSet<String> h = new HashSet<String>();
			   /* read log line by line */
			   while ((strLine = br.readLine()) != null)   {
			     /* parse strLine to obtain what you want */
				   
				   Pattern p = Pattern.compile("\\[([^\\]]+)\\]");
				   Matcher m = p.matcher(strLine);
				    while (m.find()) {
				      System.out.println("We found: " + m.group(1));
				      if(Character.isDigit(m.group(1).charAt(0))) {
				    	  h.add(m.group(1).substring(0, m.group(1).indexOf(" ")));
				      }
				      System.out.println ("hashset begins here");
				         System.out.println (h);
				         System.out.println ("hashset ends here");
				    }
/*				   System.out.println ("start of line");
			     System.out.println (strLine);
			     System.out.println ("end of line");
			     String[] values = strLine.split("\\[");
			     StringTokenizer st = new StringTokenizer(strLine, "[");
			     String nextToken = "";
			     System.out.println ("start of split values");
			     System.out.println(Arrays.toString(values));
			     System.out.println ("end of split values");
			     for (String s: values) {           
			         Do your stuff here
			         System.out.println(s);
			         if(s.contains("]") && s.contains(":") && s.contains("/") && Character.isDigit(s.charAt(0))) {
			        	 h.add(s);
			      }
			      System.out.println ("hashset begins here");
			      System.out.println (h);
			      System.out.println ("hashset ends here");
			     }
			     while(st.hasMoreTokens())
			    	 nextToken = st.nextToken();
			     if(nextToken.contains("]")) {
			    	 h.add(nextToken);	
			     }
		     System.out.println ("hashset starts here");
			    System.out.println (h);
			     System.out.println ("222222222222");*/
			     
			     
			   }
			   fstream.close();
			} catch (Exception e) {
			     System.err.println("Error: " + e.getMessage());
			}
    }
}
