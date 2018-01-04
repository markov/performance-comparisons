package org.gradle.test.performance16_5

import org.junit.Assert.*

class Test16_493 {
    private val production = Production16_493("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}