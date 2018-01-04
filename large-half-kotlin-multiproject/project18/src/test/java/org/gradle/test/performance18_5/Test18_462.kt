package org.gradle.test.performance18_5

import org.junit.Assert.*

class Test18_462 {
    private val production = Production18_462("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}