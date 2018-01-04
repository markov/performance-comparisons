package org.gradle.test.performance43_4

import org.junit.Assert.*

class Test43_315 {
    private val production = Production43_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
