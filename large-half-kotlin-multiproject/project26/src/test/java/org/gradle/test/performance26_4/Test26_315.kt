package org.gradle.test.performance26_4

import org.junit.Assert.*

class Test26_315 {
    private val production = Production26_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}