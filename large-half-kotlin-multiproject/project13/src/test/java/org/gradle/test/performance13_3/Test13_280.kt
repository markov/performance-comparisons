package org.gradle.test.performance13_3

import org.junit.Assert.*

class Test13_280 {
    private val production = Production13_280("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}