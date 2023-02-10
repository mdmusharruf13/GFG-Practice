/*
Input:
S: nlaebolko
Output: 1
Explanation:
Here, the number of occurence of 'b' = 1
of occurence of 'a' = 1
of occurence of 'l' = 2
of occurence of 'o' = 2
of occurence of 'n' = 1
So, we can form 1 "balloon" using the letters.
  */

//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                b++;
            }
            else if(s.charAt(i) == 'a'){
                a++;
            }
            else if(s.charAt(i) == 'l'){
                l++;
            }
            else if(s.charAt(i) == 'o'){
                o++;
            }
            else if(s.charAt(i) == 'n'){
                n++;
            }
        }
        
        l/=2;
        o/=2;
        
        int balloon=0;
        for(int i=0; i<b && i<a && i<l && i<o && i<n; i++){
            balloon++;
        }
        
        return balloon;
    }
}
