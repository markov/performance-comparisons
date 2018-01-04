package org.gradle.test.performance35_1

import org.junit.Assert.*

class Test35_40 {
    private val production = Production35_40("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}