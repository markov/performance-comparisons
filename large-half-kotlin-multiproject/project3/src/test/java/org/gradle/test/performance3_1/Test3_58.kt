package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_58 {
    private val production = Production3_58("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}