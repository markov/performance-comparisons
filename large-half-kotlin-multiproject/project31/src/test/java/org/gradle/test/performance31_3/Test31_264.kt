package org.gradle.test.performance31_3

import org.junit.Assert.*

class Test31_264 {
    private val production = Production31_264("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}