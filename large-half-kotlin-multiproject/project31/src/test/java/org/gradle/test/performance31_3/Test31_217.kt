package org.gradle.test.performance31_3

import org.junit.Assert.*

class Test31_217 {
    private val production = Production31_217("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}