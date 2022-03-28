package com.utils.builders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import org.junit.jupiter.api.Assertions;

public class FromJsonExtention {

    public static ObjectMapper mapper = new ObjectMapper()
            .setAccessorNaming(new DefaultAccessorNamingStrategy.Provider().withSetterPrefix("with"));

    public static <ClassBuilder> ClassBuilder fromJson(Class<ClassBuilder> builder, String json) {
        try {
            return mapper.readValue(json, builder);
        } catch (JsonProcessingException e) {
            Assertions.fail(e.getMessage());
        }
        return null;
    }

}
