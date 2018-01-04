package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_46 {
    private val production = Production10_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}