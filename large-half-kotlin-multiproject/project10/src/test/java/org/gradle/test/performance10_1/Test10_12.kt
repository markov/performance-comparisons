package org.gradle.test.performance10_1

import org.junit.Assert.*

class Test10_12 {
    private val production = Production10_12("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}