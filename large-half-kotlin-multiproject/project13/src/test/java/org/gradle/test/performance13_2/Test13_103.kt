package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_103 {
    private val production = Production13_103("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}