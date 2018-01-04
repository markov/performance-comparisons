package org.gradle.test.performance47_4

import org.junit.Assert.*

class Test47_315 {
    private val production = Production47_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
