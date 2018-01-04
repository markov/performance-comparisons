package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_59 {
    private val production = Production3_59("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}