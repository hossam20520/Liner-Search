/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liner.search.array;

/**
 *
 * @author Hossam
 */
public class LinerSearchArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {5,4,3,1,1};
        System.out.println(LinerSearch(array, 1));
        
    }
    
    public static int LinerSearch(int[] arr , int key){
        
        for (int i=0; i<arr.length; i++){
            if(key == arr[i]){
                return i;
            }
            
        }
        
        return -1;
    }
    
}
