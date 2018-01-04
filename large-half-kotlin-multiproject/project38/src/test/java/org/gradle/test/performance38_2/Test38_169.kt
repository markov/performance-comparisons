package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_169 {
    private val production = Production38_169("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}