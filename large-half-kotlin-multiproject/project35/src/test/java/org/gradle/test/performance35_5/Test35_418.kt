package org.gradle.test.performance35_5

import org.junit.Assert.*

class Test35_418 {
    private val production = Production35_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}