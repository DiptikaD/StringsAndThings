package io.zipcoder;


import org.codehaus.plexus.util.StringUtils;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */

    public Integer countYZ(String input) {
        String[] yzArr = input.split(" ");

        int counter = 0;
        for (String element : yzArr) {

            if (element.charAt(yzArr.length) == 'y') {
                counter++;
            } else if (element.charAt(yzArr.length) == 'z') {
                counter++;
            }
        }

        return counter;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
//        char[] baseArr = base.toCharArray();
//        char[] removeArr = remove.toCharArray();
//        StringBuilder removedBase = new StringBuilder();
//
//
//    //        if(baseArr[element] == remove.contains(remove.ch)){
//
//
//
////            if (charArr[element] != remove.charAt(element)){
////                removedBase.append(remove.charAt(element));
////            }
//
//
//
//        return removedBase.toString();
//    }

//        StringBuilder removedBase = new StringBuilder();
//        for (int i = 0; i <= base.length(); i++){
//           if (base.charAt(i) == remove.charAt(i)){
//            for (int j = 0; j<= remove.length(); j++) {
//                if (base.charAt(i) != remove.charAt(j)) {
//                    removedBase.append(base.charAt(j));
//                }
//            }
//            }
//
//        }
//        return removedBase.toString();
//
//        base.replace(remove, "");
//        return base;

        base = StringUtils.replace(base, remove, "");
        return base;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
//        int counterIs = 0;
//        int counterNot = 0;
//
//        for (int i = 0; i <= input.length() - 1; i++) {
//            if (i + 1 <= input.length() - 1 && input.charAt(i) == 'i' && input.charAt(i + 1) == 's') {
//                counterIs++;
//            } else if (i + 2 <= input.length() - 1 && input.charAt(i) == 'n' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't') {
//                counterNot++;
//            }
//        }
//        if (counterIs % 2 == 0 && counterNot % 2 == 0) {
//            return true;
//        }
//        return false;
    int isCounter = StringUtils.countMatches(input, "is");
    int notCounter = StringUtils.countMatches(input, "not");
        if (isCounter % 2 == 0 && notCounter % 2 == 0) {
            return true;
        }
        return false;

    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        int counterG = 0;
        int sadCounter = 0;

        for (int i = 0; i <= input.length() - 1; i++) {

            if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') {
                counterG++;
            } else if (input.charAt(i) == 'g' && input.charAt(i - 1) == 'g' && input.charAt(i + 1) != 'g') {
            } else if (input.charAt(i) == 'g' && input.charAt(i + 1) != 'g') {
                sadCounter++;
            }
        }

        if (counterG > 0 && sadCounter <= 0) {
            return true;
        }
        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int tripleCounter = 0;

        for (int i = 0; i <= input.length() - 1; i++) {
            if (i + 1 < input.length() && i - 1 >= 0 && input.charAt(i) == input.charAt(i - 1) && input.charAt(i) == input.charAt(i + 1)) {
                tripleCounter++;
            }
        }
    return tripleCounter;
    }
}
