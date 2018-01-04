package org.gradle.test.performance17_1

import org.junit.Assert.*

class Test17_79 {
    private val production = Production17_79("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}