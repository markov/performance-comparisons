package org.gradle.test.performance40_4

import org.junit.Assert.*

class Test40_315 {
    private val production = Production40_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}