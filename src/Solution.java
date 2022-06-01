import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) 
    {
    	int array[]=new int [10];
    	int arr[]=new int [10];
    	int max=0,area=0 ,m=0;
    	for(int i=0;i<word.length();i++)
    	{
    		arr[i]=(int)word.charAt(i);
    		//System.out.println(arr[i]);//arr=[97,98,99]
    	}
    	for(int j=0;j<word.length();j++)
    	{
    		m=(arr[j])-97;//[0,1,2]
    		//System.out.println(m);
    		array[j]=h[m];//array=[1,3,1]
    		//System.out.println(array[j]);
    	}
    	for(int k=0;k<word.length();k++)
    	{
    		if(max<array[k])
    			max=array[k];
    		
    	}
    	area=max*(word.length());
    	return area;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
