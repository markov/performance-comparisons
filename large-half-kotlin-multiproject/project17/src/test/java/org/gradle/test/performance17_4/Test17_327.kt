package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_327 {
    private val production = Production17_327("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}