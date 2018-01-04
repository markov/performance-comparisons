package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_127 {
    private val production = Production13_127("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}