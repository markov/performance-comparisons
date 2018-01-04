package org.gradle.test.performance35_2

import org.junit.Assert.*

class Test35_189 {
    private val production = Production35_189("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}