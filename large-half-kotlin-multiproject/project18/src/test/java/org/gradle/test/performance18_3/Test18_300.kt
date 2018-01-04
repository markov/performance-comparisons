package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_300 {
    private val production = Production18_300("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}