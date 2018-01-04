package org.gradle.test.performance45_4

import org.junit.Assert.*

class Test45_315 {
    private val production = Production45_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
