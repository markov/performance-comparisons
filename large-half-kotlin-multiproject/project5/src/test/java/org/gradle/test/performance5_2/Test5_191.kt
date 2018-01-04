package org.gradle.test.performance5_2

import org.junit.Assert.*

class Test5_191 {
    private val production = Production5_191("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}