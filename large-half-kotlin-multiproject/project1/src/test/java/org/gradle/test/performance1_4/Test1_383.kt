package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_383 {
    private val production = Production1_383("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}