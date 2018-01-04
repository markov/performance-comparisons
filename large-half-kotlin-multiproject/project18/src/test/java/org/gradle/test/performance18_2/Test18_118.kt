package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_118 {
    private val production = Production18_118("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}