package com.utils.builders;

import com.ParentClass;
import lombok.Builder;

class ChildrenClass2 extends ParentClass {


    @Builder(setterPrefix = "with", toBuilder = true)
     public ChildrenClass2(String someField) {
         super(someField);
     }
 }
