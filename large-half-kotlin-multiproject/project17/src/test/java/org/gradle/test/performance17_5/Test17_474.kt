package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_474 {
    private val production = Production17_474("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}