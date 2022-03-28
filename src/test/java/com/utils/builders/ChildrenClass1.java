package com.utils.builders;

import com.ParentClass;
import lombok.Builder;

@Builder(setterPrefix = "with", toBuilder = true)
class ChildrenClass1 extends ParentClass {

 }
