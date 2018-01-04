package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_356 {
    private val production = Production17_356("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}