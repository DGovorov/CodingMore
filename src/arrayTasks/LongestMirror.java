package arrayTasks;

import java.util.List;

/**We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
 * the same group appears in reverse order.
 * For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
 * Return the size of the largest mirror section found in the given array.
 * Created by Dim on 06.04.2016.
 */
public class LongestMirror {

    public int findLongestMirror(List<Integer> array){
        int currentLongestMirror = 0;
        int currentMirrorLength = 0;
        int arraySize = array.size();

        for (int i = 0; i < arraySize; i++) {
            for (int j = arraySize-1; j >= 0 ; j--) {
                if (array.get(i).equals(array.get(j))){
                    currentMirrorLength = findMirrorLength(array, i, j);
                    if (currentLongestMirror < currentMirrorLength){
                        currentLongestMirror = currentMirrorLength;
                    }
                }
            }
        }
        return currentLongestMirror;
    }

    private int findMirrorLength(List<Integer> array, int firstIndex, int secondIndex){
        int counter = 0;
        while (firstIndex < array.size() && secondIndex >= 0){
            if (array.get(firstIndex).equals(array.get(secondIndex))){
                counter++;
            } else {
                break;
            }
            firstIndex++;
            secondIndex--;
        }
        return counter;
    }
}
