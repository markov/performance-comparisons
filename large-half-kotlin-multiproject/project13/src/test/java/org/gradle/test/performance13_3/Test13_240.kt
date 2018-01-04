package org.gradle.test.performance13_3

import org.junit.Assert.*

class Test13_240 {
    private val production = Production13_240("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}