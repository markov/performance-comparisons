package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_12 {
    private val production = Production41_12("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
