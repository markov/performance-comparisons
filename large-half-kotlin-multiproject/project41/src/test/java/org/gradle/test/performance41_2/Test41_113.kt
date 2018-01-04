package org.gradle.test.performance41_2

import org.junit.Assert.*

class Test41_113 {
    private val production = Production41_113("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
