package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_4 {
    private val production = Production10_4("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}