package org.gradle.test.performance20_4

import org.junit.Assert.*

class Test20_334 {
    private val production = Production20_334("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}