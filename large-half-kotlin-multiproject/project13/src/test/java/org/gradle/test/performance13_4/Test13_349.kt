package org.gradle.test.performance13_4

import org.junit.Assert.*

class Test13_349 {
    private val production = Production13_349("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}