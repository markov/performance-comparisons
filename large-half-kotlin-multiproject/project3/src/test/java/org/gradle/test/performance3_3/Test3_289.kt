package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_289 {
    private val production = Production3_289("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}