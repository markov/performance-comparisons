package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_412 {
    private val production = Production10_412("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}