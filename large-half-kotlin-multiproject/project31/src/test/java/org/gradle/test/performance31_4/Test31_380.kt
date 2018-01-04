package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_380 {
    private val production = Production31_380("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}