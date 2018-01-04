package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_315 {
    private val production = Production27_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}