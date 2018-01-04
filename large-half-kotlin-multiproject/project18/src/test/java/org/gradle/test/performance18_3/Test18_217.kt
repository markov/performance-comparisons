package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_217 {
    private val production = Production18_217("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}