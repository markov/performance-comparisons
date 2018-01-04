package org.gradle.test.performance31_3

import org.junit.Assert.*

class Test31_281 {
    private val production = Production31_281("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}