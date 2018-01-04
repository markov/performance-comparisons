package org.gradle.test.performance31_1

import org.junit.Assert.*

class Test31_7 {
    private val production = Production31_7("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}