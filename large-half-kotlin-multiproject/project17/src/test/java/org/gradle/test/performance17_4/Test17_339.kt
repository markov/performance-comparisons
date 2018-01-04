package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_339 {
    private val production = Production17_339("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}