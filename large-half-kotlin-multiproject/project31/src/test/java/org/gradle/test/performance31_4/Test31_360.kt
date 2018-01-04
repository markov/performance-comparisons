package org.gradle.test.performance31_4

import org.junit.Assert.*

class Test31_360 {
    private val production = Production31_360("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}