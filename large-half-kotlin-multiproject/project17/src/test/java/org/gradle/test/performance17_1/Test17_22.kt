package org.gradle.test.performance17_1

import org.junit.Assert.*

class Test17_22 {
    private val production = Production17_22("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}