package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_150 {
    private val production = Production18_150("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}