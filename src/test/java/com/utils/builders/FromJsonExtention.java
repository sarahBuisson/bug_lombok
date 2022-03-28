package com.utils.builders;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class FromJsonExtention {



    public static <ClassBuilder> ClassBuilder fromJson(ClassBuilder builder, String json) {

        try {
            var clazz = builder.getClass().getDeclaringClass();

            var initialValue = new ObjectMapper().readValue(json, clazz);
            Arrays.stream(clazz.getMethods()).filter(m -> m.getName().startsWith("get")&&!m.getName().equals("getClass")).forEach(
                    m -> {
                        try {
                            builder.getClass().getMethod(m.getName().replace("get", "with"), m.getReturnType()).invoke(builder, m.invoke(initialValue));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

            );
            return builder;
        } catch (Exception e) {

            e.printStackTrace();
        }
        return null;
    }

}
