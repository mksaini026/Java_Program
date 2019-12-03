package stringPrgm;

import java.util.Scanner;

public class SubstringComp {

    public static String getSmallestAndLargest(String s, int k) {
        // String smallest = "";
        // String largest = "";
        
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String temp;
        for(int i = 1 ; i <= s.length() - k  ; i++)
        {
            temp = s.substring(i, i + k);
            if(smallest.compareTo(temp) > 0) smallest = temp;
            if(largest.compareTo(temp) < 0) largest = temp;
        }
        return smallest + "\n" + largest;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
