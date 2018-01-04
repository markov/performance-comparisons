package org.gradle.test.performance11_4

import org.junit.Assert.*

class Test11_315 {
    private val production = Production11_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}