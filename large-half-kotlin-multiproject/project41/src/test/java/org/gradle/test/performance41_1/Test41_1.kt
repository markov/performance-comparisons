package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_1 {
    private val production = Production41_1("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
