package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_61 {
    private val production = Production10_61("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}