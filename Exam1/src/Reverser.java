import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class Reverser extends Numbers {
   
      //TODO add some code
      //
      
   	// TODO
   	// return the ArrayList that has the elements 
   	// that Numbers has in int[] nums,
   	// but in the reversed order
   	public ArrayList<Integer> reverse(){
         ArrayList <Integer> reverseList = new ArrayList <Integer> ();
         int [] reverseNums = super.getNums();
         for(int i = 0; i < reverseNums.length; ++i) {
        	 reverseList.add(reverseNums[i]);
         }
         Collections.reverse(reverseList);
         return reverseList;
         }
	   
	   // TODO 
	   // find the second biggest value
	   // keep in mind that the biggest value could be include more 
	   // than once
	   public int findSecondBiggest() {
	      int secondMax = 0;
	      int [] num = super.getNums();
	      Arrays.sort(num);
	      for(int i = super.getNums().length - 1; i >= 0; --i ) {
	    	  if(super.getNums()[i] != 0) {
	    		  secondMax = super.getNums()[i];
	    	  }
	      }
	   	   return secondMax;
	   }	 
}