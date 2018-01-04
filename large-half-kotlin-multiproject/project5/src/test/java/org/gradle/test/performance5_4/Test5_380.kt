package org.gradle.test.performance5_4

import org.junit.Assert.*

class Test5_380 {
    private val production = Production5_380("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}