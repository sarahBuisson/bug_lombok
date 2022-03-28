package com.utils.builders;

import com.ParentClass;
import lombok.Builder;

class ChildrenClassWithoutLombok extends ParentClass {
 public ChildrenClassWithoutLombok(String someField) {
  super(someField);
 }
}
