package com.db.studies.w1d2;

import com.db.studies.w1d2.lab1.ListUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class ListUtilTest {

    @Test
    public void countDuplicate() {
        List<String> strings = Arrays.asList("java", "JAVA", "JaVa", "Scala");
        int amount = ListUtil.countDuplicate("java", strings,
                (first, second) -> first!= null && first.equalsIgnoreCase(second));
        Assert.assertEquals(3,amount);
    }
}