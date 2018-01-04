package org.gradle.test.performance14_4

import org.junit.Assert.*

class Test14_315 {
    private val production = Production14_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}