package org.gradle.test.performance44_4

import org.junit.Assert.*

class Test44_315 {
    private val production = Production44_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
