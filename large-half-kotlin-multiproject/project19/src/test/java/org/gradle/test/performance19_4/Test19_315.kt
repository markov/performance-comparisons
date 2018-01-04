package org.gradle.test.performance19_4

import org.junit.Assert.*

class Test19_315 {
    private val production = Production19_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}