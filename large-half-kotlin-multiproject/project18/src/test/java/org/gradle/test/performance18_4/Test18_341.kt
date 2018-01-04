package org.gradle.test.performance18_4

import org.junit.Assert.*

class Test18_341 {
    private val production = Production18_341("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}