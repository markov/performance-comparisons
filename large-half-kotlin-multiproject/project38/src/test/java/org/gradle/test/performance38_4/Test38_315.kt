package org.gradle.test.performance38_4

import org.junit.Assert.*

class Test38_315 {
    private val production = Production38_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}