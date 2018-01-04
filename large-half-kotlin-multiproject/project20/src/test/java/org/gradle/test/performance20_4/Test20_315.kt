package org.gradle.test.performance20_4

import org.junit.Assert.*

class Test20_315 {
    private val production = Production20_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}