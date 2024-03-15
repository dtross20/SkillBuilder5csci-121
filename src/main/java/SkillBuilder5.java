import java.util.Arrays;

/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (dtross)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        //TODO: replace this line with your code.
        double sum = 0;
        double[] myArray = new double[data.length];
        for(int loopVar = 0; loopVar < data.length; loopVar++){
            sum += data[loopVar];
            myArray[loopVar] = sum / (loopVar + 1);
        }
        return myArray;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        //TODO: replace this line with your code.
        for( int loopVar2 = 0; loopVar2< anArray.length;loopVar2+=1){
            if ( anArray[loopVar2] == searchValue){
                return loopVar2;
            }
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        //TODO: replace this line with your code.
        for( int loopVar3 = 0; loopVar3< anArray.length;loopVar3+=1){
            if ( anArray[loopVar3] == s){
                return loopVar3;
            }
        }
        return -1;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        String [] rossDeyvon  = new String [anArray.length];
        int i = 0;
        for (int loopVar4 = 0; loopVar4 < anArray.length; loopVar4+=1){
            if(anArray[loopVar4] != s){
                rossDeyvon[i] = anArray[loopVar4];
                i+=1;
            }
        }
        return Arrays.copyOfRange(rossDeyvon,0,i);
    }// add your code here



    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        for(int i = 0; i < anArray.length / 2; i++) {
            int temp = anArray[i];
            anArray[i] = anArray[anArray.length - i - 1];
            anArray[anArray.length - i - 1] = temp;
        }// add your code here
    }
}
