import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array size
        System.out.println("Enter a nuber:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input array element
        System.out.println("Enter a number:");
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        }
        //selection sort
        for(int i=0;i<n-1;i++){
            int minIndex =i;
            for(int j=i+1;j<n;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex =j;
                }
            }
            //swap
            int temp =arr[i];
            arr[i] =arr[minIndex];
            arr[minIndex]= temp;
        }
        System.out.println("sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");
        }
        sc.close();
        }
    }
