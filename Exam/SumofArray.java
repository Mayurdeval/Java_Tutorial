package Exam;

public class SumofArray {

public static void main(String[] args) {
    int ar[] = {1,7,6,9};
    int sum=0;
    for(int i=0;i<ar.length;i++){
        sum = sum+ar[i];
    }

    System.out.println(sum);
}
}