package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_5 {
    private val production = Production10_5("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}