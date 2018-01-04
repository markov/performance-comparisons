package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_223 {
    private val production = Production38_223("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}