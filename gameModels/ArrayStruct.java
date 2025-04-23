package gameModels;

import java.util.ArrayList;

public class ArrayStruct {
    //Linear Search
    public int findElement(ArrayList <Integer> arr, int n, int key) {
        int i; 
        for (i = 0; i < n; i++) {
            if (arr.get(i) == key) {
                return i;
            }
        }
        return -1; 
    } 

     //Deleting Elements
     public int deleteElement(ArrayList <Integer> arr, int size, int pos){
        if(pos == -1){
            return size;
        }
        
        for(int i = pos; i < size-1; i++){
            //arr[i] = arr[i+1];
            int arrNext = arr.get(i+1);
            arr.set(i, arrNext);
        }
        return (size-1);
    }

    //Element Insertion
    public int insertSorted(String[] arr, int n, String key, int capacity){
        if (n >= capacity){
            return n;
        }
        else {
            arr[n] = key;
            return (n+1);
        }
    }
}
