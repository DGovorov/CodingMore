package arrayTasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dim on 07.04.2016.
 */
public class LongestMirrorTest {

    @Test
    public void mirrorShouldBeZeroInEmptyList(){
        LongestMirror example = new LongestMirror();
        List<Integer> testList = new ArrayList<>();

        int result = example.findLongestMirror(testList);
        Assert.assertEquals(0, result);
    }

    @Test
    public void mirrorShouldBeOneDigitLongInListWithOneElement(){
        LongestMirror example = new LongestMirror();
        List<Integer> testList = new ArrayList<>();
        testList.add(0);

        int result = example.findLongestMirror(testList);
        Assert.assertEquals(1, result);
    }

    @Test
    public void shouldReturnAppropriateResultForTwoMirroredParts(){
        LongestMirror example = new LongestMirror();
        List<Integer> testList = new ArrayList<>();

        //1 2 3 and 3 2 1 mirrored
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(6);
        testList.add(7);
        testList.add(3);
        testList.add(2);
        testList.add(1);
        testList.add(0);

        int result = example.findLongestMirror(testList);
        Assert.assertEquals(3, result);
    }

    @Test
    public void shouldReturnAppropriateResultForOnePalindrome(){
        LongestMirror example = new LongestMirror();
        List<Integer> testList = new ArrayList<>();

        //9 9 4 5 4 9 9 - palindrome
        testList.add(5);
        testList.add(9);
        testList.add(9);
        testList.add(4);
        testList.add(5);
        testList.add(4);
        testList.add(9);
        testList.add(9);
        testList.add(2);

        int result = example.findLongestMirror(testList);
        Assert.assertEquals(7, result);
    }
}
