package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_451 {
    private val production = Production17_451("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}