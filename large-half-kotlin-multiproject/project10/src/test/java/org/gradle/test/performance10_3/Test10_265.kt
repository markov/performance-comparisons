package org.gradle.test.performance10_3

import org.junit.Assert.*

class Test10_265 {
    private val production = Production10_265("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}