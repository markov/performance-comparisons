package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_232 {
    private val production = Production18_232("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}