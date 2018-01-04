package org.gradle.test.performance12_4

import org.junit.Assert.*

class Test12_315 {
    private val production = Production12_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}