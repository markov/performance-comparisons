package org.gradle.test.performance17_3

import org.junit.Assert.*

class Test17_273 {
    private val production = Production17_273("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}