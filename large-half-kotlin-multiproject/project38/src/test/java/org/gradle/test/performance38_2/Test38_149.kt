package org.gradle.test.performance38_2

import org.junit.Assert.*

class Test38_149 {
    private val production = Production38_149("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}