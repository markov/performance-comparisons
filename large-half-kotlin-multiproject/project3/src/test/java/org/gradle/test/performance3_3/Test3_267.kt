package org.gradle.test.performance3_3

import org.junit.Assert.*

class Test3_267 {
    private val production = Production3_267("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}