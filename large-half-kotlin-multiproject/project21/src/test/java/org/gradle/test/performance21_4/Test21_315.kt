package org.gradle.test.performance21_4

import org.junit.Assert.*

class Test21_315 {
    private val production = Production21_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}