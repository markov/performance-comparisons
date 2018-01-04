package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_62 {
    private val production = Production3_62("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}