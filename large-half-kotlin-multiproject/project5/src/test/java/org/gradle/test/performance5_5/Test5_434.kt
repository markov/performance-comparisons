package org.gradle.test.performance5_5

import org.junit.Assert.*

class Test5_434 {
    private val production = Production5_434("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}