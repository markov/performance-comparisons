package org.gradle.test.performance13_4

import org.junit.Assert.*

class Test13_339 {
    private val production = Production13_339("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}