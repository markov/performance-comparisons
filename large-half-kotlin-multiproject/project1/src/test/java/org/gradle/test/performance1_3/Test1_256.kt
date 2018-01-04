package org.gradle.test.performance1_3

import org.junit.Assert.*

class Test1_256 {
    private val production = Production1_256("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}