package org.gradle.test.performance13_3

import org.junit.Assert.*

class Test13_204 {
    private val production = Production13_204("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}