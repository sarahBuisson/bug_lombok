package com.utils.builders;

import com.ParentClass;
import lombok.Builder;

@Builder(setterPrefix = "with", toBuilder = true)
class ChildrenClass4 extends ParentClass {

    @Builder(setterPrefix = "with")
    public ChildrenClass4(String someField) {
        super(someField);
    }
}
