package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_379 {
    private val production = Production10_379("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}