package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_125 {
    private val production = Production38_125("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}