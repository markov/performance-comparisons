package org.gradle.test.performance41_4

import org.junit.Assert.*

class Test41_315 {
    private val production = Production41_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
