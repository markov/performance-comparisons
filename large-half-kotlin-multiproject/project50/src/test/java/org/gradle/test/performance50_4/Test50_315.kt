package org.gradle.test.performance50_4

import org.junit.Assert.*

class Test50_315 {
    private val production = Production50_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
