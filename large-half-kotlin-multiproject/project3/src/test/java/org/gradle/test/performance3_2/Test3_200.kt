package org.gradle.test.performance3_2

import org.junit.Assert.*

class Test3_200 {
    private val production = Production3_200("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}