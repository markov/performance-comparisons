package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_414 {
    private val production = Production17_414("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}