package com.buschmais.jqassistant.plugin.junit.test.set.junit5.annotations;

import org.junit.jupiter.api.Test;

public class MultipleTagAnnotationTest {
    @MultipleTagAnnotation
    @Test
    public long getLong() {
        return 0L;
    }
}
