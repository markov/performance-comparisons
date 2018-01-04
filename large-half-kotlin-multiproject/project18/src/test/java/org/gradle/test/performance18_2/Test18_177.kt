package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_177 {
    private val production = Production18_177("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}