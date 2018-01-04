package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_315 {
    private val production = Production31_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}