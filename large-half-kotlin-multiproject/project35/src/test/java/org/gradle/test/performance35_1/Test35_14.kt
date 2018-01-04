package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_14 {
    private val production = Production35_14("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}