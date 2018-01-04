package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_56 {
    private val production = Production35_56("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}