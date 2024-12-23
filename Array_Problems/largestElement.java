package Array_Problems;

import java.util.Scanner;

public class largestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = largest(arr);
        System.out.println(ans);
        sc.close();
    }

    private static int largest(int [] arr){
        int ans = arr[0];
        for(int i = 0; i<arr.length; i++){
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }
}