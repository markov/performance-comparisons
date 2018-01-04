package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_136 {
    private val production = Production13_136("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}