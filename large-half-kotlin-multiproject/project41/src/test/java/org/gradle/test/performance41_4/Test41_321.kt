package org.gradle.test.performance41_4

import org.junit.Assert.*

class Test41_321 {
    private val production = Production41_321("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
