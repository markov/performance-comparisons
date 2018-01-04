package org.gradle.test.performance41_4

import org.junit.Assert.*

class Test41_342 {
    private val production = Production41_342("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
