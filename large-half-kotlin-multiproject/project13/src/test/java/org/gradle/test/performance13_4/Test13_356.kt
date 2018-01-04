package org.gradle.test.performance13_4

import org.junit.Assert.*

class Test13_356 {
    private val production = Production13_356("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}