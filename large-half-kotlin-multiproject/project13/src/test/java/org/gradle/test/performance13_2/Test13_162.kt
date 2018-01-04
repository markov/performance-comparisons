package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_162 {
    private val production = Production13_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}