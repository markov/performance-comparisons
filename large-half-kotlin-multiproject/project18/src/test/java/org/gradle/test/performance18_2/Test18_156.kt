package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_156 {
    private val production = Production18_156("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}