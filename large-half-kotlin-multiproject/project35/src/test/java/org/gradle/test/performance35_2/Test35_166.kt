package org.gradle.test.performance35_2

import org.junit.Assert.*

class Test35_166 {
    private val production = Production35_166("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}