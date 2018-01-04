package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_49 {
    private val production = Production3_49("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}