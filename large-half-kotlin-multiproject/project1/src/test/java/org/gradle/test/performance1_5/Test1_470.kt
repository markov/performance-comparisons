package org.gradle.test.performance1_5

import org.junit.Assert.*

class Test1_470 {
    private val production = Production1_470("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}