package org.gradle.test.performance18_4

import org.junit.Assert.*

class Test18_335 {
    private val production = Production18_335("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}