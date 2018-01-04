package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_367 {
    private val production = Production17_367("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}