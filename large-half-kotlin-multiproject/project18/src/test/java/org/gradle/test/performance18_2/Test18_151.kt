package org.gradle.test.performance18_2

import org.junit.Assert.*

class Test18_151 {
    private val production = Production18_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}