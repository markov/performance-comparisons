package org.gradle.test.performance5_2

import org.junit.Assert.*

class Test5_184 {
    private val production = Production5_184("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}