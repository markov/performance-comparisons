package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_422 {
    private val production = Production17_422("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}