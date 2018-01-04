package org.gradle.test.performance7_2

import org.junit.Assert.*

class Test7_136 {
    private val production = Production7_136("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}