package org.gradle.test.performance10_3

import org.junit.Assert.*

class Test10_202 {
    private val production = Production10_202("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}