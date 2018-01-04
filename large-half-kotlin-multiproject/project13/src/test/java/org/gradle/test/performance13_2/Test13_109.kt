package org.gradle.test.performance13_2

import org.junit.Assert.*

class Test13_109 {
    private val production = Production13_109("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}