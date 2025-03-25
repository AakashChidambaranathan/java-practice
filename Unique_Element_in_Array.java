public class Unique_Element_in_Array {
    public static void main(String args[]){
        int [] arr={2,2,2,2,3,4,4};
        System.out.println(uniqueelement(arr));
    }
    public static int uniqueelement(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum^=arr[i];
        }

        return sum;
    }
}
