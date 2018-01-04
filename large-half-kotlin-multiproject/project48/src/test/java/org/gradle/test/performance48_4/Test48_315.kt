package org.gradle.test.performance48_4

import org.junit.Assert.*

class Test48_315 {
    private val production = Production48_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
