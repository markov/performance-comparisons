package org.gradle.test.performance16_4

import org.junit.Assert.*

class Test16_315 {
    private val production = Production16_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}