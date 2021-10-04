import java.util.*;

class Index_Find{
    public static int[] findIndex(int arr[] , int num){
      int res[] =new int[arr.length];

        int i = 0 , j = 0 ;

        while(i < arr.length || j < res.length){

          if(arr[i] == num){
              res[j] = i;
              j++;
          }

          i++;


        }

            return res;
    }
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter te length : ");
      int len = sc.nextInt();

      int arr[] = new int[len];

      System.out.println(" Enter the elements : ");
      for(int i = 0 ; i < arr.length; i++)
              arr[i] = sc.nextInt();

      System.out.println(" Enter the number which you want to serch : ");
      int num = sc.nextInt();

      int res[] = findIndex(arr , num);

      for(int i = 0 ; i < res.length ; i++)
          System.out.print(res[i] + " ");
    }
}
