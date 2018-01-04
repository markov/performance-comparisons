package org.gradle.test.performance49_4

import org.junit.Assert.*

class Test49_315 {
    private val production = Production49_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
