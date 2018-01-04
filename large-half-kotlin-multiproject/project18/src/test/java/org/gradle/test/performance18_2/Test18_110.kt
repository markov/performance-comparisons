package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_110 {
    private val production = Production18_110("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}