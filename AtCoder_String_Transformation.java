package com.codechef;

import java.util.HashMap;

/**
 * 
 * Problem : String Transformation
 * 
 * 
 * Problem Link : https://atcoder.jp/contests/abc110/tasks/abc110_c
 *
 */

public class AtCoder_String_Transformation {

	public static void solve() throws Exception {

		String s1 = "azzel";
        String s2 = "apple";
        
        HashMap<Character, Character> map1 = new HashMap<>();
        
        HashMap<Character, Character> map2 = new HashMap<>();
        
        int n = s1.length();
        
        for(int i = 0; i<n; i++){
            map1.put(s1.charAt(i), s2.charAt(i));
            map2.put(s2.charAt(i), s1.charAt(i));
        }
        
        for(int i = 0; i<n; i++){
        
        	if(map1.get(s1.charAt(i)).equals(s2.charAt(i))  && map2.get(s2.charAt(i)).equals(s1.charAt(i))) {
        		continue;
        	}
            
        	else {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
	}

	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
