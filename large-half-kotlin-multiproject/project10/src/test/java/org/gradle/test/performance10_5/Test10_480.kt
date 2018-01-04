package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_480 {
    private val production = Production10_480("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}