import java.util.*;
class task2{
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 5 numbers : ");
        int a[]= new int[5];
        for(int i=0;i<5;i++){
            a[i] = S.nextInt();
        }
        System.out.println("The Given array is : ");
        for(int i=0;i<5;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
        int temp;
        //sorting operation
        for(int i=0;i<5-1;i++){
            for(int j =i+1 ; j<5;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        System.out.println("The Sorted array is : ");
        for(int i=0;i<5;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
        //second highest and second lowest numbers
        System.out.println("Second highest number : "+a[5-1-1]);
        System.out.println("Second Lowest number : "+a[1]);
    }
}