package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_380 {
    private val production = Production25_380("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}