package org.gradle.test.performance10_4

import org.junit.Assert.*

class Test10_380 {
    private val production = Production10_380("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}