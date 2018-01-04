package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_291 {
    private val production = Production18_291("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}