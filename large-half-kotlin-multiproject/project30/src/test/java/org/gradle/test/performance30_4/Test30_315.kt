package org.gradle.test.performance30_4

import org.junit.Assert.*

class Test30_315 {
    private val production = Production30_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}