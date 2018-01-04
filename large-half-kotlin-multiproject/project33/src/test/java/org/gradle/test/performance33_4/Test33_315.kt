package org.gradle.test.performance33_4

import org.junit.Assert.*

class Test33_315 {
    private val production = Production33_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}