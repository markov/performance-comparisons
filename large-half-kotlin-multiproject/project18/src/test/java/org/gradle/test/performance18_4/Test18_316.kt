package org.gradle.test.performance18_4

import org.junit.Assert.*

class Test18_316 {
    private val production = Production18_316("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}