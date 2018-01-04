package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_88 {
    private val production = Production3_88("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}