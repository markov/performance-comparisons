package org.gradle.test.performance1_4

import org.junit.Assert.*

class Test1_345 {
    private val production = Production1_345("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}