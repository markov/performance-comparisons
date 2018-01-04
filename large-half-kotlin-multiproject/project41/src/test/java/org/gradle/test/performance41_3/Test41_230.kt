package org.gradle.test.performance41_3

import org.junit.Assert.*

class Test41_230 {
    private val production = Production41_230("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
