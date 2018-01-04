package org.gradle.test.performance17_3

import org.junit.Assert.*

class Test17_260 {
    private val production = Production17_260("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}