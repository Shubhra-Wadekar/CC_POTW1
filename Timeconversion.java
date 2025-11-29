import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    StringBuilder sb=new StringBuilder(s);
    String hour=sb.substring(0,2);
    String minute=sb.substring(2,6);
    String sec=sb.substring(6, 8);
    String period=sb.substring(8,10);
    int hh=Integer.parseInt(hour);
    if(period.equals("AM")){
    if(hh==12){
        hour="00";
    }
    }
    
    else{
        
    if(hh!=12){
        
          hh+=12;
        hour=String.valueOf(hh);
    }
    }
    String s1=hour+minute+sec;
    
    return s1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

