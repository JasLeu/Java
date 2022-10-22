import java.util.*;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/

public class Review {
  static Scanner sc = new Scanner(System.in);
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
  private static final String SPACE = " ";

  public static void main(String[] args) throws IOException 
  {
    System.out.println(totalSentiment("ConsumerLab_Code\\SimpleReview.txt"));
    // String evaluation = textToString("ConsumerLab_Code\\SimpleReview.txt");
    // boolean cont = true;
    // double totalSentiment = 0;
    // while (cont) {
    //   try {
    //     int space = evaluation.indexOf(" ");
    //     String curWord = evaluation.substring(0, space);
    //     curWord = removePunctuation(curWord);
    //     totalSentiment += sentimentVal(curWord);
    //     evaluation = evaluation.substring(space + 1);
    //     // System.out.println(totalSentiment);
    //   } catch (Exception e) {
    //     cont = false;
    //   }
    // }
    // System.out.printf("%.2f",totalSentiment);
  }

  static{
    try {
      Scanner input = new Scanner(new File("ConsumerLab_Code\\cleanSentiment.csv"));
      int i = 0;
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        // System.out.println(temp); 
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        // System.out.println("Success");
        // System.out.println(sentiment);
        i++;
        if (i == 6279) {
          break;
        }
         // System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("ConsumerLab_Code\\positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        // System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("ConsumerLab_Code\\negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  public static double totalSentiment(String fileName) {
    boolean cont = true;
    double total = 0;
    
    String evaluation = textToString(fileName);
    while (cont) {
      try {
        int space = evaluation.indexOf(" ");
        String curWord = evaluation.substring(0, space);
        curWord = removePunctuation(curWord);
        total += sentimentVal(curWord);
        evaluation = evaluation.substring(space + 1);
      } catch (Exception e) {
        cont = false;
      }
    }
    String stringTotal = Double.toString(total);
    int indexOfZero = stringTotal.indexOf("000");
    stringTotal = stringTotal.substring(0, indexOfZero);
    total = Double.parseDouble(stringTotal);
    return total;
  }

  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

      /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }

  
 
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }
}
