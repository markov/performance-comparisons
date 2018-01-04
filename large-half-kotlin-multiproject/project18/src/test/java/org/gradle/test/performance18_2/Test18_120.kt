package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_120 {
    private val production = Production18_120("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}