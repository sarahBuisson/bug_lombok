package com.utils.builders;

import com.ParentClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.ExtensionMethod;

@NoArgsConstructor
@ExtensionMethod({FromJsonExtention.class})
class ChildrenClass3 extends ParentClass {

    @Builder(setterPrefix = "with")
    public ChildrenClass3(String someField) {
        super(someField);
    }

    public static ChildrenClass3Builder fromJson(String json) {
       return ChildrenClass3Builder.class.fromJson(json);
    }

}
