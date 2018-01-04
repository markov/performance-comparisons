package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_151 {
    private val production = Production3_151("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}