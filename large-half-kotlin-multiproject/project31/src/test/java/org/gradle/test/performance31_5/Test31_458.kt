package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_458 {
    private val production = Production31_458("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}