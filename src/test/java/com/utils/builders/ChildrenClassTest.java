package com.utils.builders;

import com.ParentClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChildrenClassTest {

    @Test
    public void testBuilder() throws Exception {


        new ChildrenClass3.ChildrenClass3Builder().withSomeField("").build();
        var x = ChildrenClass3.fromJson("{\"someField\":\"rr\"}");
        Assertions.assertEquals(x.build().getSomeField(), "rr");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
