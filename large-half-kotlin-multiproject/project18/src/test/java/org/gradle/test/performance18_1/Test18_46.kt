package org.gradle.test.performance18_1

import org.junit.Assert.*

class Test18_46 {
    private val production = Production18_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}