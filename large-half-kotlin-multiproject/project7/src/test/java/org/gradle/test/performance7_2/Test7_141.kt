package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_141 {
    private val production = Production7_141("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}