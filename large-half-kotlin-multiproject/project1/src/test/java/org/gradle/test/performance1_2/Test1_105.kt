package org.gradle.test.performance1_2

import org.junit.Assert.*

class Test1_105 {
    private val production = Production1_105("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}