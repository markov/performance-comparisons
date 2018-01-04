package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_339 {
    private val production = Production16_339("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}