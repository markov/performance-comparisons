package org.gradle.test.performance24_4

import org.junit.Assert.*

class Test24_315 {
    private val production = Production24_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}