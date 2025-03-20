import java.util.*;
class Reverse_an_Array {
    public static void main(String args[]){
        int [] arr= {1,2,3,4,5};
        arr=reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int [] reverse(int arr[]){
        int length=arr.length;
        int[] temp=new int[length];
        for(int i=0;i<length;i++){
            temp[i]=arr[length-i-1];
        }
        for(int j=0;j<length;j++){
            arr[j]=temp[j];
        }
        return arr;
    }
}