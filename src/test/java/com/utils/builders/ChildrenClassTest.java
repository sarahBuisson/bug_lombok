package com.utils.builders;

import com.ParentClass;
import org.junit.jupiter.api.Test;

public class ChildrenClassTest {

    @Test
    public void testBuilder() throws Exception {
        new ParentClass("someField");
        new ChildrenClassWithoutLombok("someField");

        new ChildrenClass1.ChildrenClass1Builder().withSomeField("").build();
        new ChildrenClass1().toBuilder().withSomeField("").build();

        new ChildrenClass2.ChildrenClass2Builder().withSomeField("").build();
        new ChildrenClass2("").toBuilder().withSomeField("").build();

        new ChildrenClass3.ChildrenClass3Builder().withSomeField("").build();
        new ChildrenClass3("").toBuilder().withSomeField("");

        new ChildrenClass4.ChildrenClass4Builder().withSomeField("").build();
        new ChildrenClass4("").toBuilder().withSomeField("").build();


        new ChildrenClass5.ChildrenClass5Builder().withSomeField("").build();
        new ChildrenClass5("").toBuilder().withSomeField("").build();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
