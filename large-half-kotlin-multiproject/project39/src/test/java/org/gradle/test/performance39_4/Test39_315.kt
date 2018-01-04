package org.gradle.test.performance39_4

import org.junit.Assert.*

class Test39_315 {
    private val production = Production39_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}