package org.gradle.test.performance18_4

import org.junit.Assert.*

class Test18_349 {
    private val production = Production18_349("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}