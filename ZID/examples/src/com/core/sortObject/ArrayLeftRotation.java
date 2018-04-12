package com.core.sortObject;

import java.util.Scanner;

public class ArrayLeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        if( n >= k ) {
        	if(n == k){
                for(int i : a) {
                	System.out.print(i + " ");
                }
            }
            else {
            	for(int i = k; a.length > i ;i++  ) {
                	System.out.print(a[i] + " ");
                }
            	for(int i = 0; k > i ;i++  ) {
            		System.out.print(a[i]+ " ");
            	}
            }
        }
        
    }
}
