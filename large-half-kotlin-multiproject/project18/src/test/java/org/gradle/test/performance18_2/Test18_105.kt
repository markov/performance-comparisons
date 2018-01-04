package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_105 {
    private val production = Production18_105("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}