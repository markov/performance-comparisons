package org.gradle.test.performance10_2

import org.junit.Assert.*

class Test10_178 {
    private val production = Production10_178("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}