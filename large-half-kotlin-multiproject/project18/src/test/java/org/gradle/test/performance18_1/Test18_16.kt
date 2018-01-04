package org.gradle.test.performance18_1

import org.junit.Assert.*

class Test18_16 {
    private val production = Production18_16("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}