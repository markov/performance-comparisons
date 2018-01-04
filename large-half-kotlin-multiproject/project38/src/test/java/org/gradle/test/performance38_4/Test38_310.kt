package org.gradle.test.performance38_4

import org.junit.Assert.*

class Test38_310 {
    private val production = Production38_310("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}