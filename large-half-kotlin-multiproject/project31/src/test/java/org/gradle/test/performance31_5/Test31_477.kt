package org.gradle.test.performance31_5

import org.junit.Assert.*

class Test31_477 {
    private val production = Production31_477("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}