package org.gradle.test.performance20_5

import org.junit.Assert.*

class Test20_462 {
    private val production = Production20_462("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}