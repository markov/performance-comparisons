package org.gradle.test.performance7_4

import org.junit.Assert.*

class Test7_317 {
    private val production = Production7_317("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}