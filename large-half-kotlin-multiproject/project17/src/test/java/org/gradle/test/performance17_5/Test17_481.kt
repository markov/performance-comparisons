package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_481 {
    private val production = Production17_481("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}