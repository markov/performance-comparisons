package org.gradle.test.performance17_1

import org.junit.Assert.*

class Test17_84 {
    private val production = Production17_84("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}