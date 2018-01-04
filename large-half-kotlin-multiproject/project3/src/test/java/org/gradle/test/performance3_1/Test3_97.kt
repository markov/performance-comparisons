package org.gradle.test.performance3_1

import org.junit.Assert.*

class Test3_97 {
    private val production = Production3_97("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}