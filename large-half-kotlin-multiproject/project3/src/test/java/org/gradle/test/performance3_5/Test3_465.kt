package org.gradle.test.performance3_5

import org.junit.Assert.*

class Test3_465 {
    private val production = Production3_465("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}