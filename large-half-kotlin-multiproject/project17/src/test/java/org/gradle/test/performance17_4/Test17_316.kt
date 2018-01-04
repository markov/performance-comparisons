package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_316 {
    private val production = Production17_316("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}