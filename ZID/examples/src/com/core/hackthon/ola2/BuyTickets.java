package com.core.hackthon.ola2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuyTickets {
	
	public static void main (String[] args) {
		
		int[] tickets = {2,6,3,4,5};
		int p=2;
		
		waitingTime(tickets, p);
	}
	
static long waitingTime(int[] tickets, int p) {
        
        Long counter = 0l;
        List<Integer> list = new ArrayList(Arrays.asList(tickets));
        for(int i= 0; i< tickets.length ; i++){
            list.add(tickets[i]);
        }
        
        int size = list.size();
        boolean done = false;
         while(!done){
             for(int j =1; j< size ; j++){
                 if(list.get(j) == 0){
                     continue;
                 }
                 if(list.get(p+1) == 0){
                     done = true;
                     break;
                 }
                 list.set(j,(list.get(j))-1);
                 counter++;
             }
         }
        
         System.out.println("counter: " + counter);
        return counter;

    }

}
