package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_136 {
    private val production = Production18_136("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}