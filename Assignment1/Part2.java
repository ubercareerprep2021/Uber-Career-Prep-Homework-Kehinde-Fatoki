import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kehindefatoki
 */


public static boolean isStringPermutation(String s1, String s2) {
    //created 2 hashmaps to store both strings
    HashMap<Character, Integer> string1 = new HashMap<>();
    HashMap<Character, Integer> string2 = new HashMap<>();
    int count = 1;
    int count2 = 1;

    //iterated through the string and stored each character and its occurence into hashmap
    for(int i = 0; i < s1.length(); i++){
        if(!string1.containsKey(s1.charAt(i))){
            string1.put(s1.charAt(i), count);
        } else {
//                string1.put(s1.charAt(i), string1.get(s1.charAt(i)) + 1);
            string1.put(s1.charAt(i), count + 1);
        }
    }

    for(int i = 0; i < s2.length(); i++){
        if(!string2.containsKey(s2.charAt(i))){
            string2.put(s2.charAt(i), count2);
        } else {
            string2.put(s2.charAt(i), count2 + 1);
        }
    }
    // used the .equals method of the hashmap to compare both hashmaps
    return string1.equals(string2);

}

public static List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
    List<List<Integer>> totalArray = new ArrayList();

    //created a nested for loop to compare and add all the values and find the sum
    for(int i = 0; i < inputArray.size(); i++){
        for(int j = i + 1; j < inputArray.size(); j++){
            if(inputArray.get(i) + inputArray.get(j) == targetSum){
                List<Integer> tupleArray = new ArrayList();
                tupleArray.add(inputArray.get(i));
                tupleArray.add(inputArray.get(j));
                totalArray.add(tupleArray);
            }
        }

    }

    return totalArray;
}

public static void main(String[] args) {
    List<Integer> a = new ArrayList();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);

    System.out.println(pairsThatEqualSum(a, 8));


    String s1 = "0Apple0";
    String s2 = "0Alepp0";

    System.out.println(isStringPermutation(s1,s2));

}