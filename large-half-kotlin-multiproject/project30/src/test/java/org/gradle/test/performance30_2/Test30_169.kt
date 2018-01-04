package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_169 {
    private val production = Production30_169("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}