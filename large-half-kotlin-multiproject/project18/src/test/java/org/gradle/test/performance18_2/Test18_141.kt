package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_141 {
    private val production = Production18_141("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}