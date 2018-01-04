package org.gradle.test.performance17_2

import org.junit.Assert.*

class Test17_194 {
    private val production = Production17_194("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}