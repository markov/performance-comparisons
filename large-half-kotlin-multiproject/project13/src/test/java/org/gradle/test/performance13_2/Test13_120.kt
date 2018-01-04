package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_120 {
    private val production = Production13_120("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}