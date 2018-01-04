package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_293 {
    private val production = Production3_293("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}