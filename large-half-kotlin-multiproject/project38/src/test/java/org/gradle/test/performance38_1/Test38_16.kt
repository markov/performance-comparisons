package org.gradle.test.performance38_1

import org.junit.Assert.*

class Test38_16 {
    private val production = Production38_16("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}