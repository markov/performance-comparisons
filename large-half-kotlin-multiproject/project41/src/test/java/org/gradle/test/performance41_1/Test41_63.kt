package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_63 {
    private val production = Production41_63("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
