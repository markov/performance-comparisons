package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_317 {
    private val production = Production17_317("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}