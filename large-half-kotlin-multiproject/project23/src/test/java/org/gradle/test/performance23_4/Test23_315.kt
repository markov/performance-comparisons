package org.gradle.test.performance23_4

import org.junit.Assert.*

class Test23_315 {
    private val production = Production23_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}