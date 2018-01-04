package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_113 {
    private val production = Production18_113("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}