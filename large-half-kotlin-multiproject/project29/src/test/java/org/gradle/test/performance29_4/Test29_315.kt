package org.gradle.test.performance29_4

import org.junit.Assert.*

class Test29_315 {
    private val production = Production29_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}