//Java program which find out the most repeated number from given string

import java.util.*;

class RepeatedNumber{
    //method to find the most repeated number from the given string
    static int[] mostFrequent(int arr[], int n)
    {

        // Sort the array
        Arrays.sort(arr);

        // find the max frequency using linear traversal
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }
        // return the repeated number and its count
        return new int[] {res,max_count};
    }

    // main method
    public static void main (String[] args) {
               //givenstring
                String [] str = {"1","1","2","2","3","4","2","2","2","2","2","2","7","8","9","10"};
                int size = str.length;
                int [] arr = new int [size];
                //convert string to integer array
                for(int i=0; i<size; i++) {
                        arr[i] = Integer.parseInt(str[i]);
                }
               int array[]=mostFrequent(arr,size);
               System.out.println(array[0]+" is repeated "+array[1]+" times");
    }
}