package practice;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle{
        public static  void swap(int first , int second , int [] arr){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
        public static void shufflingArrary(int[] arr){
             Random  obj=new Random();
             for(int i=arr.length-1;i>0;i--){
                 int swapIndex=obj.nextInt(i); //to reduce same index swap we use (i-1);
                 swap(i , swapIndex , arr);
             }

        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7,8};
            shufflingArrary(arr);
            System.out.println(Arrays.toString(arr));

        }
    }




