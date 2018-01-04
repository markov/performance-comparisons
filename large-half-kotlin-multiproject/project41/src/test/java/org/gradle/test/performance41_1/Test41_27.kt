package org.gradle.test.performance41_1

import org.junit.Assert.*

class Test41_27 {
    private val production = Production41_27("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
