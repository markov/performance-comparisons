package org.gradle.test.performance37_4

import org.junit.Assert.*

class Test37_315 {
    private val production = Production37_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}