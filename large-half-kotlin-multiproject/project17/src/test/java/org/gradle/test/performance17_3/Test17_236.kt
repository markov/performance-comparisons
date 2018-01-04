package org.gradle.test.performance17_3

import org.junit.Assert.*

class Test17_236 {
    private val production = Production17_236("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}