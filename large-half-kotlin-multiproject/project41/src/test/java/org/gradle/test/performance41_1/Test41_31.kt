package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_31 {
    private val production = Production41_31("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
