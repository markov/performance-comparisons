package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_135 {
    private val production = Production18_135("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}