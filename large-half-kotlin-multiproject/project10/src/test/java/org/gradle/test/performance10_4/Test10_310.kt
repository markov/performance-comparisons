package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_310 {
    private val production = Production10_310("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}