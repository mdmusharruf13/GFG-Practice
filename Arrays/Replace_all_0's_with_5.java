/*
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554"

if number does not contain 0 then return same value
*/

//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        // Your code here
        int ans=0;
        String str = Integer.toString(num);
        for(int i=0; i<str.length(); i++){
            char s = str.charAt(i);
            if(s == '0'){
                ans = (ans * 10) + 5;
            }
            else{
                ans = (ans * 10) + Integer.parseInt(String.valueOf(s));
            }
        }
        
        return ans;
    }
}
