package com.utils.builders;

import com.ParentClass;
import lombok.Builder;

class ChildrenClass3 extends ParentClass {

    @Builder(setterPrefix = "with")
    public ChildrenClass3(String someField) {
        super(someField);
    }
}
