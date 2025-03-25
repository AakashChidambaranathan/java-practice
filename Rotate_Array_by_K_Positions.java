import java.util.*;
public class Rotate_Array_by_K_Positions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
    }

    public static int[] reotation(int[] arr,int k){
        for(int i=0;i<k;i++){
            int last=arr[arr.length-1];
            for(int j=0;j<arr.length;j++){
                arr[j+1]=arr[j];
            }
            
        }
    }
}
