package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_499 {
    private val production = Production31_499("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}