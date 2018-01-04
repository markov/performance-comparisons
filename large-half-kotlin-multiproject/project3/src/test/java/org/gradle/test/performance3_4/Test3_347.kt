package org.gradle.test.performance3_4

import org.junit.Assert.*

class Test3_347 {
    private val production = Production3_347("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}