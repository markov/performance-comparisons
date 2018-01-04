package org.gradle.test.performance41_2

import org.junit.Assert.*

class Test41_151 {
    private val production = Production41_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
