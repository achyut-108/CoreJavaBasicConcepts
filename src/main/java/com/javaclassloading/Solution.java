package com.javaclassloading;

import java.util.HashMap;
import java.util.Map;

class Solution
{
    public static String FirstNonRepeating(String A)
    {
        // code here
        
        int[] charArr = new int[256];
        StringBuilder sb = new StringBuilder();
        char[] arr = A.toCharArray();
        char nonRepeatingChar = arr[0];
        sb.append(nonRepeatingChar);
        int count = A.length() - 1;
        int index = 0;
        boolean found = false;
        for(int i = 1; i<A.length(); i++){
        	System.out.println("strat.." + arr[i]);
            count--;
            if(nonRepeatingChar == arr[i]){
                charArr[(int) nonRepeatingChar] = 1;
                for(int j=index+1; j<i; j++){
                    if(charArr[(int)arr[j]] == 0){
                        nonRepeatingChar = arr[j];
                        index = j;
                        found = true;
                        sb.append(nonRepeatingChar);
                        System.out.println(nonRepeatingChar);
                        break;
                       // System.out.println("result till now.. "+ sb.toString());
                    }
                }
                if(!found){
                    sb.append("#");
                }
            }else{
                if(charArr[(int)nonRepeatingChar] == 0){
                    sb.append(nonRepeatingChar);
                }else if(charArr[(int) arr[i]] == 0){
                    sb.append(arr[i]);
                    nonRepeatingChar = arr[i];
                    index = i;
                }
            }
            System.out.println("result till now.. "+ sb.toString());
        }
        return sb.toString();
    }
    
    public static String FirstNonRepeatingCorrect(String A)
    {
        // code here
        char[] arr = A.toCharArray();
        Map<Character,Integer> auxMap = new HashMap<>();
        StringBuilder result = new StringBuilder(""+arr[0]);
        System.out.println("result---- " + arr[0]);
        auxMap.put(arr[0], 1);
        int nonRepeatingCharIndex = 0;
        boolean found = false;
        for(int i = 1; i<arr.length; i++){
            Integer existingCount = auxMap.get(arr[i]);
            existingCount = existingCount == null ? 1: existingCount + 1;
            auxMap.put(arr[i], existingCount);
            if(arr[i] == arr[nonRepeatingCharIndex]){
                for(int j = nonRepeatingCharIndex+1; j<=i; j++){
                    Integer count = auxMap.get(arr[j]);
                    if(count ==1 ){
                        nonRepeatingCharIndex = j;
                        result.append(arr[j]);
                        found = true;
                        break;
                    }
                }
                if(!found){
                    result.append("#");
                }
            }else{
                result.append(arr[nonRepeatingCharIndex]);
            }
            System.out.println("result till now.. "+ result.toString());
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
		Solution.FirstNonRepeatingCorrect("aabc");
	}
}