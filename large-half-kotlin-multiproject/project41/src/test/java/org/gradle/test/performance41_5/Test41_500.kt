package org.gradle.test.performance41_5

import org.junit.Assert.*

class Test41_500 {
    private val production = Production41_500("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
