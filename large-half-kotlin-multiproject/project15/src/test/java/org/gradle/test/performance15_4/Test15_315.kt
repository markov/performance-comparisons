package org.gradle.test.performance15_4

import org.junit.Assert.*

class Test15_315 {
    private val production = Production15_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}