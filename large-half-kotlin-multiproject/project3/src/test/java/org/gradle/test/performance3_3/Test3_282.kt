package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_282 {
    private val production = Production3_282("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}