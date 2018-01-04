package org.gradle.test.performance13_5

import org.junit.Assert.*

class Test13_464 {
    private val production = Production13_464("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}