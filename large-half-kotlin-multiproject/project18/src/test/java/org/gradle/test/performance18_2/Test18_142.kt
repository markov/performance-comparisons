package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_142 {
    private val production = Production18_142("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}