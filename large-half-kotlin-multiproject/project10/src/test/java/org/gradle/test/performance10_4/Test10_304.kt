package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_304 {
    private val production = Production10_304("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}