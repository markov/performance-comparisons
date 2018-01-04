package org.gradle.test.performance38_4

import org.junit.Assert.*

class Test38_349 {
    private val production = Production38_349("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}