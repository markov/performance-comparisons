package org.gradle.test.performance13_4

import org.junit.Assert.*

class Test13_315 {
    private val production = Production13_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}