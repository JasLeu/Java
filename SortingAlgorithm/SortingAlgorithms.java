package SortingAlgorithm;

/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    /* your code goes here */
    
    // selection
    // Use a for loop to iterate through all the values in the list. This loop
    // will keep track of which value will be swapped with the lowest value.
    for (int i = 0; i < intList.size() - 1; i++)
    {
      // Create a variable to hold the index of the smallest number.
      int minIndex = i;
      
      // Use a sequential search to find the smallest number
      for (int searchIndex = i + 1; searchIndex < intList.size(); searchIndex++)
      {
        // If the value at minIndex is larger, then set minIndex to the index of the 
        // smaller value.
        if(intList.get(searchIndex) < intList.get(minIndex))
          minIndex = searchIndex;
      }
      
      // Create a variable to temporarily hold the current value at index i
      // and one to hold the smallest value at index minIndex
      int temp = intList.get(i);
      int smallest = intList.get(minIndex);
      
      // Swap the values
      intList.set(i, smallest);
      intList.set(minIndex, temp);
    }
    return intList;
  }

    
  

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    /* your code goes here */
    // Begin by creating a for loop to iterate through the list, begining
    // at the second element. 
    for (int i = 1; i < intList.size(); i++) 
    {
      
      // Create an integer value for valueToSort that is the first unsorted element.
      // Remember, for the insertion sort, the first element of the array is considered sorted
      int valueToSort = intList.get(i); 
      
      // Create an int variable to hold the last element of the sorted portion of the array. 
      // It's right before the first element of the unsorted portion of the array
      int prevIndex = i - 1; 
      
      // Use a loop to move backwards through the sorted elements of the array using prevIndex
      // in the condition of the loop
      while (prevIndex >= 0)  
      {
        // Create an int variable to hold the sorted value. 
        int sortedValue = intList.get(prevIndex);
        
        // Check if the sorted value is greater than the value to sort
        if (sortedValue > valueToSort) 
        {
          // If so, switch the values at indexes prevIndex and prevIndex + 1
          intList.set(prevIndex + 1, sortedValue);
          intList.set(prevIndex, valueToSort); 
        }
        prevIndex--;
      }
    }
    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    /* your code goes here */
    for (int i = 0; i < doubleList.size(); i++) {
      double curV = doubleList.get(i);
      for (int j = i + 1; j < doubleList.size();j++) {
        if (curV > doubleList.get(j)) {
          doubleList.set(i, doubleList.get(j));
          doubleList.set(j, curV);
        }
      }
    }
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    /* your code goes here */
    for (int i = 1; i < doubleList.size(); i++) {
      double num = doubleList.get(i);
      int prevI = i-1;
      while (i >= 0) {
        if (num > doubleList.get(i)) {
          
        }
        i--;
      }
    }
    return doubleList;
  }

}