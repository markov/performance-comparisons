package org.gradle.test.performance10_5

import org.junit.Assert.*

class Test10_403 {
    private val production = Production10_403("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}