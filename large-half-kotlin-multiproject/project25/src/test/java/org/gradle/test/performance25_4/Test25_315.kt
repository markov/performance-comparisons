package org.gradle.test.performance25_4

import org.junit.Assert.*

class Test25_315 {
    private val production = Production25_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}