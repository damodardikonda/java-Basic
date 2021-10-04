/* Save this in a file called Main.java to compile and test it */

import java.util.*;

import java.io.*;

public class Main {

    public void findConsequtive(int[] arr){
            int encounter = 0 ;
        for (int i = 0 ; i < arr.length-2 ; i++ ) {
            
            if(arr[i] % 10 == 6){

                encounter++;
            }
            else if(arr[i] % 10 == 6 && arr[i+1] % 10 == 6 ){
                encounter = encounter+2;
            }
        
                if(encounter > 1){

                    arr[i] = arr[i+1];
                }

                else if(encounter==2){
                    if(arr[i+3] != 0){    
                    arr[i] = arr[i+2];
                    arr[i+1] = arr[i+3]; 
                }
                    else{
                        arr[i] = arr[i+2];
                    arr[i+1] = 0; 
                        
                    }
            }
        }

        for (int i = 0 ; i < arr.length ; i++ ) {
            
            System.out.println(arr[i]);
        }

    }
     public static void main(String[] args){

        int arr[] = {3, 6, 36, 62, 121, 66, 26, 376, 661, 6};
        Main n = new Main();
        n.findConsequtive(arr);
 }

}