package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_357 {
    private val production = Production31_357("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}