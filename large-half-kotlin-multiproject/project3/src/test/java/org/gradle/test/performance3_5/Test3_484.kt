package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_484 {
    private val production = Production3_484("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}