package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_33 {
    private val production = Production3_33("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}