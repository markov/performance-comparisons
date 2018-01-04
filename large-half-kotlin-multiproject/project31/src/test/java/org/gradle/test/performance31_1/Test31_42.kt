package org.gradle.test.performance31_1

import org.junit.Assert.*

class Test31_42 {
    private val production = Production31_42("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}