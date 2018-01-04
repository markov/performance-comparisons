package org.gradle.test.performance17_3

import org.junit.Assert.*

class Test17_214 {
    private val production = Production17_214("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}