package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_272 {
    private val production = Production18_272("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}