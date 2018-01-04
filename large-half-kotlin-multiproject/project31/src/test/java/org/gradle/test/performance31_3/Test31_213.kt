package org.gradle.test.performance31_3

import org.junit.Assert.*

class Test31_213 {
    private val production = Production31_213("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}