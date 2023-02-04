import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //print only positive numbers of an array
        Scanner sc= new Scanner(System.in);
        int[] arr={2,6,-5,-1,0,4,-9};
        for (int i=0;i< arr.length;i++){
            if (arr[i]>=0){
                System.out.println(arr[i]);
            }
        }
    }
}