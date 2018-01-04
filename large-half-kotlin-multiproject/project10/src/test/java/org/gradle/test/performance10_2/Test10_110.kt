package org.gradle.test.performance10_2

import org.junit.Assert.*

class Test10_110 {
    private val production = Production10_110("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}