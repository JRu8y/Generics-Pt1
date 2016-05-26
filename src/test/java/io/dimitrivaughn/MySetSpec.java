package io.dimitrivaughn;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by dimitrivaughn on 5/26/16.
 */
public class MySetSpec {

    MySet<Integer> setList;

    @Before
    public void init(){
        setList = new MySet<Integer>();
    }

    @Test
    public void addOverrideTest(){
        int expectedValue = 10;
        setList.add(10);
        setList.add(10);
        int actualValue = setList.get(0);
        Assert.assertEquals("method should add to first index and return that value, expected: 10", expectedValue, actualValue);

    }

    @Test
    public void addOverrideIndexTest(){
        int expectedValue = 10;
        setList.add(5, 10);
        setList.add(6,10);
        int actualValue = setList.get(5);
        Assert.assertEquals("method should add to first index and return that value, expected: 10", expectedValue, actualValue);

    }
}
