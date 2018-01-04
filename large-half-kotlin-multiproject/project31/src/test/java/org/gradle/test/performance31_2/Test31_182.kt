package org.gradle.test.performance31_2

import org.junit.Assert.*

class Test31_182 {
    private val production = Production31_182("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}