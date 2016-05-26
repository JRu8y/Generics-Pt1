package io.dimitrivaughn;

import com.sun.org.apache.xerces.internal.xs.StringList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dimitrivaughn on 5/25/16.
 */
public class MyArrayListSpec {

    MyArrayList<Integer> intList;
    MyArrayList<Integer> intListUser;
    MyArrayList<String> stringList;

    @Before
    public void init(){
        intList = new MyArrayList<Integer>();
        intListUser = new MyArrayList<Integer>(1);
        stringList = new MyArrayList<String>();
    }

    @Test
    public void addTest(){
        int expectedValue = 10;
        intList.add(10);
        int actualValue = intList.get(0);
        Assert.assertEquals("method should add to first index and return that value, expected: 10", expectedValue, actualValue);

    }

    @Test
    public void addSpecifiedTest(){
        int expectedValue = 10;
        intList.add(3,10);
        int actualValue = intList.get(3);
        Assert.assertEquals("method should add to specified index and return that value, expected: 10", expectedValue, actualValue);
    }

    @Test
    public void addResizeTest(){
        String expectedValue = "hello";
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        stringList.add("6");
        stringList.add("7");
        stringList.add("8");
        stringList.add("9");
        stringList.add("10");
        stringList.add(5,"hello");
        String actualValue = stringList.get(5);
        Assert.assertEquals("method should double in size when arraylist is full and copy all values into new array, expected: world", expectedValue, actualValue);


    }

    @Test
    public void lengthTest(){
        int expectedValue = 10;
        int actualValue = intList.lengthTotal();
        Assert.assertEquals("method should return the total length of the array set, expected: 10", expectedValue, actualValue);
    }

    @Test
    public void sizeTest(){
        int expectedValue = 1;
        intList.add(10);
        int actualValue = intList.size();
        Assert.assertEquals("method should return the total number of elements stored in the array set, expected: 1", expectedValue, actualValue);
    }

    @Test
    public void removeTest(){
        Object expectedValue = null;
        intList.add(3, 10);
        intList.remove(3);
        Object actualValue = intList.get(3);
        Assert.assertEquals("method should remove element stored at specified index, expected: null", expectedValue, actualValue);
    }

    @Test
    public void isFullTest(){
        boolean expectedValue = true;
        intListUser.add(3);
        boolean actualValue = intListUser.isFull();
        Assert.assertEquals("method should check whether arraylist is full, expected: true", expectedValue, actualValue);

    }

    @Test
    public void isEmptyTest(){
        boolean expectedValue = true;
        boolean actualValue = intListUser.isEmpty();
        Assert.assertEquals("method should check whether arraylist is full, expected: true", expectedValue, actualValue);

    }

    @Test
    public void containsTest(){
        boolean expectedValue = true;
        intList.add(10);
        boolean actualValue = intList.contains(10);
        Assert.assertEquals("method should check whether arraylist contains specified element, expected: true", expectedValue, actualValue);

    }

    @Test
    public void clearTest(){
        String expectedValue = null;
        stringList.add("hello");
        stringList.add("world");
        stringList.add(7,"again");
        stringList.clear();
        String actualValue = stringList.get(1);
        Assert.assertEquals("method should check whether arraylist is full, expected: true", expectedValue, actualValue);

    }

    @Test
    public void resizeArrayTestLength(){
        int expectedValue = 20;
        stringList.add("hello");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.resizeArray();
        int actualValue = stringList.lengthTotal();
        Assert.assertEquals("method should double in size when arraylist is full, expected: 20", expectedValue, actualValue);

    }

    @Test
    public void resizeArrayTestValue(){
        String expectedValue = "world";
        stringList.add("hello");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.add("world");
        stringList.resizeArray();
        String actualValue = stringList.get(9);
        Assert.assertEquals("method should double in size when arraylist is full and copy all values into new array, expected: world", expectedValue, actualValue);

    }



}
