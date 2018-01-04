package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_270 {
    private val production = Production18_270("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}