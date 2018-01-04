package org.gradle.test.performance20_5

import org.junit.Assert.*

class Test20_434 {
    private val production = Production20_434("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}