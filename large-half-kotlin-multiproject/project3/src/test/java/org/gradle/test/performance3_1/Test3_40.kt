package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_40 {
    private val production = Production3_40("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}