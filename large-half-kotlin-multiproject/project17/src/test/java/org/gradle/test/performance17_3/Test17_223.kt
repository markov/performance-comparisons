package org.gradle.test.performance17_3

import org.junit.Assert.*

class Test17_223 {
    private val production = Production17_223("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}