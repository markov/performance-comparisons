package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_61 {
    private val production = Production41_61("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
