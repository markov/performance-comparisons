package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_459 {
    private val production = Production10_459("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}