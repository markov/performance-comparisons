package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_86 {
    private val production = Production10_86("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}