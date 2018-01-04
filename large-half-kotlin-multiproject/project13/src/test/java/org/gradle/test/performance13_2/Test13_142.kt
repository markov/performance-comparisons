package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_142 {
    private val production = Production13_142("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}