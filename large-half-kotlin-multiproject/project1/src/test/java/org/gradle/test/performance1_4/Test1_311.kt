package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_311 {
    private val production = Production1_311("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}