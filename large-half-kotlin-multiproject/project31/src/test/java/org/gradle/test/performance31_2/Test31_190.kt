package org.gradle.test.performance31_2

import org.junit.Assert.*

class Test31_190 {
    private val production = Production31_190("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}