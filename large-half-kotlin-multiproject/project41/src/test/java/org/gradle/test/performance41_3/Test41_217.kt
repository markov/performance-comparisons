package org.gradle.test.performance41_3

import org.junit.Assert.*

class Test41_217 {
    private val production = Production41_217("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
