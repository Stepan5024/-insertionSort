/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author Степан Бокарев
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arr =  {12,3,6,7,85,-9};
        insertionSort(arr);
    }
   public static void insertionSort(int[] arr) {
    for(int i = 1; i < arr.length; i++){
        int currElem = arr[i];
        int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElem){
                arr[prevKey+1] = arr[prevKey];
                arr[prevKey] = currElem;
                prevKey--;
            }
        }
    for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
}

