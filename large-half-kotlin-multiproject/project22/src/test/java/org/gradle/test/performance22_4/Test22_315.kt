package org.gradle.test.performance22_4

import org.junit.Assert.*

class Test22_315 {
    private val production = Production22_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}