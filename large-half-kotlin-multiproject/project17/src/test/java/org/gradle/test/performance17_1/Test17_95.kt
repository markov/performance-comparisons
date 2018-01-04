package org.gradle.test.performance17_1

import org.junit.Assert.*

class Test17_95 {
    private val production = Production17_95("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}