package org.gradle.test.performance18_4

import org.junit.Assert.*

class Test18_327 {
    private val production = Production18_327("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}