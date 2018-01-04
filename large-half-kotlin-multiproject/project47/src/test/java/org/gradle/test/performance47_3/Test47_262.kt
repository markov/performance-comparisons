package org.gradle.test.performance47_3

import org.junit.Assert.*

class Test47_262 {
    private val production = Production47_262("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
