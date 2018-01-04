package org.gradle.test.performance13_3

import org.junit.Assert.*

class Test13_214 {
    private val production = Production13_214("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}