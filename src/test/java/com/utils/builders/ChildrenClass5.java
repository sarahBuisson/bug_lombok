package com.utils.builders;

import com.ParentClass;
import lombok.Builder;

@Builder(setterPrefix = "with", toBuilder = true, builderClassName = "AlternateName")
public class ChildrenClass5 extends ParentClass {

    @Builder(setterPrefix = "with")
    public ChildrenClass5(String someField) {
        super(someField);
    }
}
